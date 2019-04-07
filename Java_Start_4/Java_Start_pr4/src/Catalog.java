import java.awt.*;
import java.io.File;
import java.io.Serializable;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.List;

public class Catalog extends CatalogIO implements Serializable {

    List<Graph> listAddedGraphs;
    private String pathOfFolder;


    /**
     * create the Catalog using a path for a specific folder
     *
     * @param pathOfFolder the path where I can find my folder
     */
    public Catalog(String pathOfFolder) throws InvalidFilePathException {
        if(!(new File(pathOfFolder).exists())) {
            throw new InvalidFilePathException("Error at path");
        }
        this.pathOfFolder = pathOfFolder;
        listAddedGraphs = new ArrayList<Graph>();
    }

    /**
     *
     *
     * @param graph the object I wanted to add
     */
    public void add(Graph graph) {
        listAddedGraphs.add(graph);
    }

    /**
     * open a graph form the hole list
     *
     * @param nameOfGraph name od the graph I wanted to open
     */
    public void open(String nameOfGraph) throws FileFormatException {
        for (Graph actualGraph : listAddedGraphs) {
            if (actualGraph.getNameOfGraph().equals(nameOfGraph)) {
                actualGraph.open();
            }
        }
    }

    /**
     * list the graphs added
     */
    public void list() {
        System.out.println(listAddedGraphs);
    }

    /**
     * this function is using the save one from the CatalogIO
     *
     * @param nameOfSavedGraph the name of the graph I wanted to save
     */
    public void save(String nameOfSavedGraph)  {
        try {
            super.save(pathOfFolder + "/" + nameOfSavedGraph, this);
        } catch (FileFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * this function is using the load one from the CatalogIO
     *
     * @param nameOfLoadedGraph  name of the graph I wanted to load
     */
    public void load(String nameOfLoadedGraph)  {
        try {
            super.load(pathOfFolder + "/" + nameOfLoadedGraph, this);
        } catch (FileFormatException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Graph> getListAddedGraphs() {
        return listAddedGraphs;
    }

    public String getPathOfFolder() {
        return pathOfFolder;
    }

}


