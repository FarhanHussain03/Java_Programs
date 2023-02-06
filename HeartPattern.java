import java.util.Scanner;

public class HeartPattern {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        for(int i = 1 ; i <= 1 ; i++){
            
            for(int s1 = 1 ; s1 <= 2 ; s1++){
                System.out.print(" ");
            }
            for(int j1 = 1 ; j1 <= 2 ; j1++){
                System.out.print(ch+" ");
            }
            for(int s2 = 1 ; s2 <= 3 ; s2++){
                System.out.print("  ");
            }
            for(int j2 = 1 ; j2 <= 2 ; j2++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= 1 ; i++){

            for(int j1 = 1 ; j1 <= 4 ; j1++){
                System.out.print(ch+" ");
            }
            for(int s1 = 1 ; s1 <= 1 ; s1++){
                System.out.print("  ");
            }
            for(int j2 = 1 ; j2 <= 4 ; j2++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        int count2 = 9;

        for(int i = 1 ; i <= 5 ; i++){

            for(int s1 = 2 ; s1 <= i ; s1++){
                System.out.print("  ");
            }
            for(int j1 = 1 ; j1 <= count2 ;j1++){
                System.out.print(ch+" ");
            }
            count2 = count2 - 2;
            System.out.println();
        }
    }
}
