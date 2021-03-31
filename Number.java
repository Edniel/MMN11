/** 
 * Class Number receives an input and in the right circumstances manipulate and print it.
 * 
 * @author  Eden Lavi
 * @version 314649799
 */
import java.util.Scanner;
public class Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        final int FIVE_DIGIT_BORDER=9999,THREE_DIGIT_BORDER=1000,SIGN=1,REVERSE=2,REVERSE_SIGN=3;
        int num,choice,firstDigit,secondDigit,thirdDigit,fourthDigit;
        System.out.println("Please enter a 4 digit number");
        num=Sc.nextInt();
        if(num<-FIVE_DIGIT_BORDER || num >FIVE_DIGIT_BORDER || num<THREE_DIGIT_BORDER && num>-THREE_DIGIT_BORDER)
            System.out.println("Illegal number- you must enter a 4 digit number.");
        else
        {
            //revealing options
            System.out.println("1.Reverse sign");
            System.out.println("2.Reverse number");
            System.out.println("3.Reverse sign and number");
            System.out.println("Please Choose an option:");
            choice=Sc.nextInt();
            if(choice<1 || choice>3)//rejecting uncompetable options
                System.out.println("Illegal option- you must choose 1,2 or 3.");
            else
            {
                firstDigit=num/1000;
                secondDigit=num/100%10;
                thirdDigit=num/10%10;
                fourthDigit=num%10;
                switch(choice)
                {
                    case SIGN:num=-num; //first option 
                    break;
                    case REVERSE:num=1000*fourthDigit+100*thirdDigit+10*secondDigit+firstDigit; //second option
                    break;
                    case REVERSE_SIGN:num=1000*fourthDigit+100*thirdDigit+10*secondDigit+firstDigit;//third option
                    num=-num;
                    break;
                }
                System.out.println("The Result is");
                System.out.println(num+".");
            }
        }
    }
}
