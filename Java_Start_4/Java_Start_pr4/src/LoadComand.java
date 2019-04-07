public class LoadComand implements GenericCommand {

    String nameOfLoadedGraph;
    Catalog catalog;

    public LoadComand(Catalog catalog, String nameOfLoadedGraph) {
        this.nameOfLoadedGraph = nameOfLoadedGraph;
        this.catalog = catalog;
    }

    public void runComand() throws ClassNotFoundException, FileFormatException {
//        catalog.load(nameOfLoadedGraph, catalog);
    }
}
