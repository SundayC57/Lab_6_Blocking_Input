import java.util.Scanner;
public class FuelCosts {
    void main(){
        Scanner in =  new Scanner(System.in);

        double gallonsHeld = 0;
        double fuelEff = 0;
        double pricePerGallon = 0;
        double hundredMilesPrice = 0;
        double hundredMileFuel = 0;
        double fullTankDist = 0;
        String trash = "";
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;

        do {
            IO.print("Enter the number of gallons your tank holds: ");

            if (in.hasNextDouble())
            {
                gallonsHeld = in.nextDouble();
                done1 = true;
            }
            else
                {
                trash = in.nextLine();
                IO.println("You entered an invalid input " + trash + " input must be a number");
                IO.println("Please try again");
                }
        }while(!done1);

        do
        {
            IO.print("Enter your fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble())
            {
                fuelEff = in.nextDouble();
                done2 = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You entered an invalid input " + trash + " input must be a number");
                IO.println("Please try again");
            }
        }while(!done2);

        do
        {
            IO.print("Enter the price per gallon: ");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                done3 = true;
            }
            else
                {
                 trash = in.nextLine();
                 IO.println("You entered an invalid input " + trash + " input must be a number");
                 IO.println("Please try again");
                }
        }while(!done3);

        hundredMileFuel = 100 / fuelEff;
        hundredMilesPrice = hundredMileFuel * pricePerGallon;
        fullTankDist = fuelEff * gallonsHeld;


        IO.println("It would cost $" + hundredMilesPrice + " to drive 100 miles");
        IO.println("You could drive " + fullTankDist + " miles on a full tank");
    }
}
