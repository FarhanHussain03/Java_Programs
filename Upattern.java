import java.util.Scanner;

public class Upattern {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        //Checking if the string is odd or even

        if(name.length() % 2 == 0){
        
        //Finding out the inner spaces    
        int innerspace = name.length() / 2;
        
        //Making loop for the rows
        for(int i = 0 ; i < name.length() / 2 ;i++){

            //Making loop for outerspace
            for(int s1 = 0 ; s1 < i ; s1++){
                System.out.print(" ");
            }
            //Printing the the each line first character
            System.out.print(name.charAt(i));

            //Making loop for the inner spaces
            for(int s2 = 0 ; s2 < innerspace ;s2++){
                System.out.print(" ");
            }
            //Printing the end character of each line
            System.out.println(name.charAt(name.length()-i-1));

            //Decreasing the space value by 2 as per question output
            innerspace = innerspace - 2;
         }
      }

      else{
        
        //Finding out the inner spaces  
        int innerspace = name.length() / 2 + 1;
        
        //Making loop for the rows
        for(int i = 0 ; i < name.length() / 2 + 1 ;i++){

            //Making loop for outerspace
            for(int s1 = 0 ; s1 < i ; s1++){
                System.out.print(" ");
            }
            //Printing the the each line first character
            System.out.print(name.charAt(i));

            //Making loop for the inner spaces
            for(int s2 = 0 ; s2 < innerspace ;s2++){
                System.out.print(" ");
            }
            //Printing the end character of each line

            System.out.println(name.charAt(name.length()-i-1));
            
            //Decreasing the space value by 2 as per question output
            innerspace = innerspace - 2;
         }
      }
   }
}
