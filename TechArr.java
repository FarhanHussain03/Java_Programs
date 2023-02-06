import java.util.Scanner;
public class TechArr{  
    public static void main(String args[]){      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = sc.nextInt();   
        int arr[] = new int[range]; 
        System.out.println("Enter the "+range+" values : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            String s = Integer.toString(num);
            int len = s.length();
            System.out.print("The check for the number "+num+" is : ");
            if(len % 2 == 0){
                int fh = num / (int)Math.pow(10,2);
                int lh = num % (int)Math.pow(10,2);  
                int val = (int)Math.pow(fh+lh,2);
                if(val == arr[i])
                {
                    System.out.print("Tech Number"+"\n");
                }
                else
                {
                    System.out.print("Not Tech Number"+"\n");
                }
            }
            else{
                System.out.println("Tech number not possible");
            }
        }
        sc.close();
        System.exit(0);
    }
}