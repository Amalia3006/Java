public class Main {

    public static void main(String[] args) {

        //afisare Hello World
        System.out.println("Hello World!");

        Language L = new Language(); //stringul
        Calcule C = new Calcule(); //calculele
        SumOfNumbers S = new SumOfNumbers();

        int rezultat = C.Calc();
        int suma = S.Numbers(rezultat);
        boolean verificare = true;
        while (verificare) {
            if (suma >= 10)
                suma = S.Numbers(suma);
            else verificare = false;
        }
        //Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
        System.out.println("Willy-nilly, this semester I will learn " + L.languages[suma]);
    }

}

