import java.util.Scanner;
public class MultiplyAndAdd
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int x,y,z;
        double sum,multiply;
        System.out.println("pleas enter three numbers");
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
        sum=(x+y+z);
        multiply=sum*2;
        System.out.println("sum "+sum);
        System.out.println("multiply "+multiply);
    }
}
 