import java.util.Scanner;
public class FuelCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas currently in the tank: ");
        double num = sc.nextDouble();
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double gas = sc.nextDouble();
        System.out.println("Enter the price of gas per gallon: ");
        double efficiency = sc.nextDouble();
        double distance = num*efficiency;
        System.out.println("The car can travel maximum " + distance + "miles.");
        double cost = gas*100;
        System.out.println("The cost per 100 miles is :" + cost);

    }
}
