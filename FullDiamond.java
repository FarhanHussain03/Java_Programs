import java.util.Scanner;

public class FullDiamond{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        //Inputing the range from the user...
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        
        //First part of the loop....
        for(int i = 1 ; i <= range ; i++){
            
            for(int j1 = range ; j1 >= i ; j1--){
                System.out.print(j1 + " ");
            }
            for(int s1 = 2 ; s1 <= i ; s1++){
                System.out.print("  "); 
            }
            for(int s2 = 2 ; s2 <= i ; s2++){
                System.out.print("  ");
            }
            for(int j2 = i ; j2 <= range ;j2++){
                System.out.print(j2 + " ");
            }
            System.out.println();
        }
                                                                        
        //Second part of the loop....
        for(int i = 2 ; i <= range ; i++){
            
            for(int j1 = 1 ; j1 <= i ; j1++){
                System.out.print(j1 + " ");
            }
            for(int s1 = i + 1 ; s1 <= range ; s1++){
                System.out.print("  ");
            }
            for(int s2 = i + 1 ; s2 <= range ; s2++){
                System.out.print("  ");
            }
            for(int j2 = 1 ; j2 <= i ; j2++){
                System.out.print(j2 + " ");
            }
            System.out.println();
        }
    }
}