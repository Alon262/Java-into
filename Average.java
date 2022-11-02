import java.util.Scanner;
public class Average
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int num1,num2,num3;
        double average,sum;
        System.out.println("pleas enter three numbers");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        sum=(num1+num2+num3);
        average=sum/3;
        System.out.println("the sum is "+sum);
        System.out.println("the average is "+average);
    }
}