import java.util.Scanner;

class BuzzNumber{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if((num % 7 == 0) && (num % 10 == 7 )){
            System.out.println("The number is buzz number");
        }
        else{
            System.out.println("The number is not a buzz number");
        }
    }
}