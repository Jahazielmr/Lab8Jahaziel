package jahazielmorenolab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminHadas {

    private ArrayList<Hadas> listaHadas = new ArrayList();
    private File archivo = null;

    public AdminHadas() {
    }

    public AdminHadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hadas> getListaHadas() {
        return listaHadas;
    }

    public void setListaHadas(ArrayList<Hadas> listaHadas) {
        this.listaHadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setHada(Hadas hada) {
        listaHadas.add(hada);
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas t : listaHadas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivoBinario() {//pasar del rom al ram!
        try {
            listaHadas = new ArrayList();

            Hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);

                try {
                    while ((temp = (Hadas) objeto.readObject()) != null) {
                        listaHadas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final el archivo
                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}