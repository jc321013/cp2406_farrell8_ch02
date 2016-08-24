/**
 * Created by jc321013 on 24/08/16.
 */
import java.util.Scanner;

public class QuartsToGalllonsInteractive {

    public static void main(String[] args)
    {
        int numberOfQuarts;
        int numQuarts;
        int Paint_Job = 18;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of quarts: ");
        numQuarts = in.nextInt();
        System.out.println("You entered quarts "+ numQuarts);
        numberOfQuarts = Paint_Job%numQuarts;
        System.out.println(" A JOb that needs " + Paint_Job + " quarts requires " + numQuarts + " gallons plus " + numberOfQuarts + " quarts ");

    }
}




