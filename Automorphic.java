import java.util.Scanner;

public class Automorphic
{
    public static void main(String args[])
    {    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int square = (int)Math.pow(number,2);

        int digit = square % (int)Math.pow(10,2);

        if(number == digit)
        {
            System.out.println("The number "+number+" is Automorphic");
        }
        else{
            System.out.println("The number "+number+" is Not Automorphic");
        }
    }
}