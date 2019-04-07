import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Catalog catalog = null;
        try {
            catalog = new Catalog("D:/graphs");
        } catch (InvalidFilePathException e) {
            e.printStackTrace();
        }
        catalog.add(new Graph("K4", "D:\\lab_pa_15.03_problema1\\complete\\K4.tgf", "complete/view/k4.png"));
        catalog.add(new Graph("Petersen", "D:\\lab_pa_15.03_problema1\\special\\petersen.tgf"));
        try {
            catalog.open("Petersen");
        } catch (FileFormatException e) {
            e.printStackTrace();
        }

        catalog.save("catalog.dat");
        catalog.load("catalog.dat");
        catalog.list();


        String test ="AddComand";
        try {
            Class testClasa=Class.forName(test);
            Constructor testConstructor=testClasa.getDeclaredConstructor(Catalog.class, Graph.class );
            Object object= testConstructor.newInstance(catalog, new Graph("test"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Scanner scannerInput = new Scanner(System.in);

        while (true) {
            String comandLine = scannerInput.nextLine();
            comandLine = " " + comandLine + " ";
            List<String> listOfInputParameter = new ArrayList<>();
            while (comandLine.contains(" ")   /* mai exista spatii*/) {

                int indexStarts = comandLine.indexOf(" ");
                if (indexStarts + 1 >= comandLine.length()) break;
                int indexEnd = comandLine.indexOf(" ", indexStarts + 1);

                listOfInputParameter.add(comandLine.substring(indexStarts+1, indexEnd));
//                System.out.println(comandLine.substring(indexStarts,indexEnd));
                comandLine = comandLine.substring(indexEnd);
//                System.out.println(comandLine);

            }
            System.out.println(listOfInputParameter);


        }
    }
}
