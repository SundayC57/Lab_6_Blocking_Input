import java.util.Scanner;
public class CtoFConverter {
    void main() {

        Scanner in = new Scanner(System.in);

        double celcius = 0;
        double farenheit = 0;
        String trash = " ";
        boolean done = false;


        do
        {
            IO.print("Enter the temperature in degrees celcius: ");

            if (in.hasNextDouble())
            {
                celcius = in.nextDouble();
                farenheit = (celcius * 9.0 / 5) + 32;
                IO.println("The value " + celcius + " is " + farenheit + "in farenheit.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("The value " + trash + " is not a valid input");
                IO.println("Try again!");
            }

        } while(!done);




    }
}