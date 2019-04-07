public class OpenComand implements GenericCommand {


    String nameOfGraph;
    Catalog catalog;

    public OpenComand(Catalog catalog, String nameOfGraph) {
        this.nameOfGraph = nameOfGraph;
        this.catalog = catalog;
    }

    public void runComand() throws FileFormatException {
        for (Graph actualGraph : catalog.getListAddedGraphs()) {
            if (actualGraph.getNameOfGraph() == nameOfGraph) {
                actualGraph.open();
            }
        }
    }
}
