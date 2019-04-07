import java.io.*;

public class CatalogIO {

    /**
     * this function save a graph in a catalog
     *
     * @param nameOfSavedGraph name of the graph I want to save on the disk
     * @param catalog          the place I wanted to save the graph
     */
    public void save(String nameOfSavedGraph, Catalog catalog) throws FileFormatException{
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nameOfSavedGraph);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(catalog);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /**
     * this function get a graph from the disk
     *
     * @param nameOfLoadedGraph name of a graph I wanted to get from the disk
     * @param catalog           the place where my graph come from
     */
    public void load(String nameOfLoadedGraph, Catalog catalog) throws FileFormatException, ClassNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream(nameOfLoadedGraph);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            catalog = (Catalog) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileFormatException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
