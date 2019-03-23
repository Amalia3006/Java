import java.sql.Time;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Hotel v1 = new Hotel("California");
        Museum v2 = new Museum("Arts");
        Church v3 = new Church("Sf Ana");

        v2.setVisitingHours(Day.MONDAY, new Time(9, 30, 0), new Time(20, 0, 0));

        TravelMap map = new TravelMap();
        map.addNode(v1);
        map.addNode(v2);
        map.addNode(v3);

        map.addEdge(v1, v2, 15);//two way street by defaultString[] args
        map.addEdge(v3, v2, 1, false);//one-way street

        System.out.println("The map is: \n" + map.getNodes());

        Day day = Day.MONDAY;

        map.getNodes().stream().filter(node -> node instanceof Visitable && !(node instanceof Payable))
                .sorted(Comparator.comparing(node2 -> ((Visitable) node2).getVisitingHours(day).getSecondParameterStartTime()))
                .forEach(node -> System.out.println(node));
        double averagePrice;
        averagePrice = map.getNodes().stream().filter(node -> node instanceof Payable).mapToDouble(node -> ((Payable) node).getEntryFee()).average().getAsDouble();
        System.out.print(averagePrice);

    }
}
