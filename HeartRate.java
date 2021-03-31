/** 
 * Class HeartRate calculates the target heart rate zone for exercising by given age.
 * 
 * @author  Eden Lavi
 * @version 314649799
 */
import java.util.Scanner;
public class HeartRate
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//creating Scanner object
        final int MAX_P=85,MIN_P=65,DIV=100,CST=220;
        int age,maxHeartBeat,minHeartBeat;
        System.out.println("This Program calculates your target heart rate while exercising.");
        System.out.print("Enter your age: ");
        age=Sc.nextInt();
        maxHeartBeat=(CST-age)*MAX_P/DIV;
        minHeartBeat=(CST-age)*MIN_P/DIV;
        System.out.println("Your estimated target heart rate zone is "+minHeartBeat+" - "+maxHeartBeat+" beats per minute.");
    }
}
