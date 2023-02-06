import java.util.Scanner;

public class Armstrong {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int temp = number;

        int d = 0;
        int sum = 0;

        while(number > 0){
            d = number % 10;
            sum = sum + (int)Math.pow(d,3); 
            number = number / 10;
        }

        if(temp == sum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}
