/**
 * Created by jc321013 on 24/08/16.
 */
public class QuartsToGallons {
    public static void main(String[] args)
    {
        int numberOfQuarts;
        int numQuarts = 4;
        int Paint_Job = 18;
        numberOfQuarts = Paint_Job%numQuarts;
        System.out.println(" A JOb that needs " + Paint_Job + " quarts requires " + numQuarts + " gallons plus " + numberOfQuarts + " quarts ");

    }
}
