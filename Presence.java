import java.util.Scanner;
public class Presence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number to find : ");
        int n = sc.nextInt();
        System.out.println("Enter the range of the array : ");
        int range = sc.nextInt();
        int arr[] = new int[range];
        System.out.println("Enter the array values : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
                System.out.println("The number is present at the index "+i);
            }
        }
    }
}
