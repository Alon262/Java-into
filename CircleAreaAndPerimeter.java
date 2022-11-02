import java.util.Scanner;
public class CircleAreaAndPerimeter
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        final double PI=3.141;
        double radius,area,perimeter;
        System.out.println("plaes enter the radius");
        radius=scan.nextInt();
        area=PI*radius*radius;
        perimeter=2*PI*radius;
        System.out.println("The area is "+area);
        System.out.println("the perimeter is "+perimeter);
    }
}