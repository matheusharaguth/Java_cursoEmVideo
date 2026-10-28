import java.util.Scanner;

public class exerc_02 {
    public static void main(String[] args) {
        System.out.println("----- Conversão de temperatura -----");
        Scanner sc = new Scanner(System.in);
        int temperaturaCelsius;
        double temperaturaFahrenheit;

        System.out.println("Insira a temperatura em Celsius: ");
        temperaturaCelsius = sc.nextInt();

        temperaturaFahrenheit = (temperaturaCelsius* 9/5) + 32;


        System.out.println("Essa é a temperatura em °C: " + temperaturaCelsius );
        System.out.println("Essa é a temperatura convertida para Fahrenheit: "+(double) temperaturaFahrenheit);



    }
}
