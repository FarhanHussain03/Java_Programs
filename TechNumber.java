import java.util.Scanner;

public class TechNumber 
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        String num = sc.nextLine();
        int len = num.length();
        int number = Integer.parseInt(num);
        
        if(len % 2 == 0)
        {
            int fh = number / (int)Math.pow(10,len/2);
            int lh = number % (int)Math.pow(10,len/2);

            int sum = (int)Math.pow(fh+lh,2);

            if(sum == number)
            {
                System.out.println("The number "+number+" is a tech number");
            }
            else{
                System.out.println("The number "+number+" is not a tech number");
            }
        }
        else{
            System.out.println("Tech number is not possible for odd numbers");
        }
    }
}
