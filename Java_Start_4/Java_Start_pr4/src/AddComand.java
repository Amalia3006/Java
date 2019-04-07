import java.util.List;

public class AddComand implements GenericCommand {

    Graph graph;
    Catalog catalog;
//    String nameOfGraph;
//    List<String> listOfParameters;

    public AddComand(Catalog catalog, Graph graph) {
        this.catalog=catalog;
       this.graph=graph;
    }

    public void runComand() {
        catalog.getListAddedGraphs();
    }


}
