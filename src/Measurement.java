import java.util.Scanner;
public class Measurement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int meters;
        double miles, feet, inches;
        System.out.print("Enter the measurement (in meters): ");
        meters = keyboard.nextInt();
        if(meters <= 0) {
            System.out.println("Measurement input must be greater than 0.");
        }else {
            inches = meters*39.37;
            feet = meters*3.28084;
            miles = meters*0.000621371;
            System.out.printf("%d meters = %.2f miles\n",meters,miles);
            System.out.printf("%d meters = %.2f feet\n",meters,feet);
            System.out.printf("%d meters = %.2f inches\n",meters,inches);
        }
    }
}
