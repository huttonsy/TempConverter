import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter temperature in celsius to be converted to farenheit: ");
            try {
                double celcius = sc.nextDouble();
                double farenheit = ((celcius * 9) / 5) + 32;
                if (celcius <= 0 && celcius <= 200){
                    System.out.printf("Corresponding temperature in farenheit:%.2f\n", farenheit);
                    break;
                }
                if (celcius < 0 && celcius >= 300) {
                    break;
                } else {
                    System.out.println("You entered an incorrect value: " + celcius);
                }
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a number");
            }

            }


    }
}