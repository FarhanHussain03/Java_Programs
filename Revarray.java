import java.util.Scanner;

public class Revarray 
{

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        //Inputing values
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int arr[] = new int[range];
        
        //Inputing range
        System.out.print("Enter the values : ");
        for(int i = 0 ; i < range ; i++){
            arr[i] = sc.nextInt();
        }
        //swap
        for(int i = 0 ; i < range/2 ; i++){
            int swap = arr[i];
            arr[i] = arr[range-i-1];
            arr[range-i-1] = swap;
        }
        //printing
        System.out.print("The reversed array is : ");
        for(int i = 0 ; i < range ; i++){
            System.out.print(arr[i]+", ");
        }    
    }
}
