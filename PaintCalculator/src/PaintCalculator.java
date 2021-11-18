
import java.util.*;

public class PaintCalculator {

    public static void main(String[] args) {

        {

            Scanner console = new Scanner(System.in);

            System.out.println("WELCOME TO PAINT CALCULATOR");
            System.out.println("Here we help you fin out how many paint tins you'll need to paint a room.");

            System.out.print("Please enter the length of the room in ft: ");
            int length = console.nextInt();

            System.out.print("Please enter the width of the room in ft: ");
            int width = console.nextInt();

            System.out.print("Please enter the height of the room in ft: ");
            double height = console.nextDouble();

            double totalSurfaceArea = 2 * ((length * width) + (length
                    * height) + (width * height));
            // finds the total sq ft of the room taking in all the measurements of the room

            int areaOfFloor = length * width;
            // area of just the floor

            double totalPaintArea = totalSurfaceArea - areaOfFloor;
                System.out.println("The total painting surface to be painted is: " + totalPaintArea);
            //this finds the area that will be painted


                System.out.println("Please enter which size paint pot you would like, 1L, 2.5L or 5L?");
                double paintSize = console.nextDouble();



                switch (paintSize)
                {
                    case 1:
                        double requiredPaint = totalPaintArea / 12;
                        System.out.println("You will require "
                                + Math.ceil(requiredPaint) + " 1L paint tins.");

                    case 2.5:
                        double requiredPaint = totalPaintArea / 30;
                        //2.5 litre tins with 30 sq ft
                        System.out.println("You will require "
                                + Math.ceil(requiredPaint) + " 2.5L paint tins.");
                }




            if (paintSize == 5)
            {
                double requiredPaint = totalPaintArea / 60;
                //5 litre tins with 60 sq ft

                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 5L paint tins.");
                // rounds up the number of tins required
            }
            else if (paintSize == 2.5 )
            {
                double requiredPaint = totalPaintArea / 30;
                //2.5 litre tins with 30 sq ft

                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 2.5L paint tins.");
            }
            else if (paintSize == 1)
            {
                double requiredPaint = totalPaintArea / 12;
                //1 litre tins with 12 ft squared

                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 1L paint tins.");
            }

        }
    }
}





