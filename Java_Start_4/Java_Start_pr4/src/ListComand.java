public class ListComand implements GenericCommand {


    Catalog catalog;

    public ListComand(Catalog catalog){
//        this.catalog=catalog;
    }

    public void runComand() {
        catalog.list();
    }
}
