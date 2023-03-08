import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        double w, h, area, perimeter, diagonal;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width of rectangle: ");
        w = scan.nextFloat();

        System.out.println("Enter the height of rectangle: ");
        h = scan.nextFloat();

        if (w > 0 && h > 0) {
            area = w * h;
            perimeter = 2 * (w + h);
            diagonal = Math.sqrt((Math.pow(h,2) + Math.pow(w,2)));
            System.out.printf("\nArea : %.2f \nPerimeter : %.2f\nDiagonal : %.2f", area, perimeter, diagonal);
        } else {
            System.out.println("Invalid number!");
        }
      }
    }

