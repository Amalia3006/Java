public class SumOfNumbers {
    public static int Numbers(int numar) {
        boolean verificare = true;
        int sum = 0;
        while (verificare) {
            sum = sum + numar % 10;
            numar /= 10;
            if (numar == 0) {
                verificare = false;
                return sum;
            }
        }
        return 0;
    }
}
