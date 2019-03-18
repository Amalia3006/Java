public class Calcule {
    public static int Calc() {
        //generare n random
        int n = (int) (Math.random() * 1_000_000);
        // System.out.println(n);

        // multiply n by 3;
        n = n * 3;
        // System.out.println(n);

        //add the binary number 10101 to the result;
        String input1 = "10101";
        int numarBinar = Integer.parseInt(input1, 2);
        n = n + numarBinar;
        //System.out.println(n);

        //  add the hexadecimal number FF to the result;
        String input2 = "FF";
        int numarHexazecimal = Integer.parseInt(input2, 16);
        n = n + numarHexazecimal;
        // System.out.println(n);

        //multiply the result by 6;
        n = n * 6;
        // System.out.println(n);
        return n;
    }
}
