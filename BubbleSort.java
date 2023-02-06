import java.util.Scanner;

public class BubbleSort{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array range : ");
        int range = sc.nextInt();
        int arr[] = new int[range];
        
        System.out.println("Enter the array values : ");
        for(int i = 0 ; i < range ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < range - 1 ; i++){
            for(int j = 0 ; j < range - 1 - i ;j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        System.out.print("The sorted array is : ");
        for(int i = 0 ; i < range ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}