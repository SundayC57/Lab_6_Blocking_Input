import java.util.Scanner;
public class RectangleInfo {
    void main(){

        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double aSquared = 0;
        double bSquared = 0;
        double cSquared = 0;
        boolean done = false;
        String trash = " ";

        Scanner in = new Scanner(System.in);

        do{
            IO.print("Enter the height of the rectangle: ");

            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.print("You entered an invalid input: " + trash + " input must be a number");
                IO.println("Please try again");
            }
        }while(!done);

        done = false;

        do {
            IO.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
                {
                trash = in.nextLine();
                IO.print("You entered an invalid input: " + trash + " input must be a number");
                IO.println("Please try again");
                }

        }while(!done);

        area = (height * width);

        IO.println("The area of the rectangle is " + area);

        perimeter = (height * 2) + (width * 2);

        IO.println("The perimeter of the rectangle is " + perimeter);

        aSquared = Math.pow(height, 2) ;
        bSquared = Math.pow(width, 2) ;
        cSquared = aSquared + bSquared;
        cSquared = Math.sqrt(cSquared);

        IO.println("The diagonal of the rectangle is " + cSquared);
    }
}
