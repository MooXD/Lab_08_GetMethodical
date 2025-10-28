public class CtoFTableDisplay {

    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println(" Celsius    | Fahrenheit ");
        System.out.println("===========================");

        for (int celsius = -100; celsius <= 100; celsius++) {

            double fahrenheit = CtoF(celsius);

            System.out.printf("%10.2f C | %10.2f F\n", (double)celsius, fahrenheit);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }

}