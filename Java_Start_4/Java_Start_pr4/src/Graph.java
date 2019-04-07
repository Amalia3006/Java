import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Graph implements Serializable {

    private String nameOfGraph;
    private List<String> listOfPathGraphs;

    public Graph(String nameOfGraph, String... nameOfFilesGraphs) {
        listOfPathGraphs = new ArrayList<String>();
        this.nameOfGraph = nameOfGraph;
        for (String actualFileOfGraph : nameOfFilesGraphs) {
            listOfPathGraphs.add(actualFileOfGraph);
        }
    }

    public String getNameOfGraph() {
        return nameOfGraph;
    }
    public void setNameOfGraph(String nameOfGraph) {
        this.nameOfGraph = nameOfGraph;
    }

    public List<String> getListOfPathGraphs() {
        return listOfPathGraphs;
    }

    public void setListOfPathGraphs(List<String> listOfPathGraphs) {
        this.listOfPathGraphs = listOfPathGraphs;
    }

    public void open() throws FileFormatException {
        for (int i = 0; i < listOfPathGraphs.size(); i++) {
            try {
                Desktop.getDesktop().open(new File(listOfPathGraphs.get(i)));
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }



    @Override
    public String toString() {
        return "Graph{" +
                "nameOfGraph='" + nameOfGraph + '\'' +
                ", listOfPathGraphs=" + listOfPathGraphs +
                '}';
    }
}
