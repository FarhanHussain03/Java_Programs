import java.util.Scanner;

public class PrimeCompArr {

    static Scanner sc = new Scanner(System.in);

    public static int factcount(int num){
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                count += 1;
            }
        }
        return(count);
    }
    public static void main(String args[]){

        System.out.println("Enter the array range : ");
        int range = sc.nextInt();

        int arr[] = new int[range];

        System.out.println("Enter the "+range+" values");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            
            int num = arr[i];

            System.out.print("The check for the value "+num+" is : ");

            if(factcount(num)==2){
                System.out.print("Prime number"+"\n");
            }
            else{
                System.out.print("Composite number"+" ");
                num++;
                while(true){
                    if(factcount(num)==2){
                        System.out.println("and the nearest prime number is : "+num);
                        break;
                    }
                }
            }
        }
    }
}
