import java.util.Scanner;

public class Encoding {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the string : ");
        String word = sc.nextLine();

        char arr[] = new char[word.length()];
        int arr1[] = new int[word.length()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = word.charAt(i);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 'a' || arr[i] == 'A'){
                arr1[i] = 1;
            }
            else if(arr[i] == 'b' || arr[i] == 'B'){
                arr1[i] = 2;
            }
            else if(arr[i] == 'c' || arr[i] == 'C'){
                arr1[i] = 3;
            }
            else if(arr[i] == 'd' || arr[i] == 'D'){
                arr1[i] = 4;
            }
            else if(arr[i] == 'e' || arr[i] == 'E'){
                arr1[i] = 5;
            }
            else if(arr[i] == 'f' || arr[i] == 'F'){
                arr1[i] = 6;
            }
            else if(arr[i] == 'g' || arr[i] == 'G'){
                arr1[i] = 7;
            }
            else if(arr[i] == 'h' || arr[i] == 'H'){
                arr1[i] = 8;
            }
            else if(arr[i] == 'i' || arr[i] == 'I'){
                arr1[i] = 9;
            }
            else if(arr[i] == 'j' || arr[i] == 'J'){
                arr1[i] = 10;
            }
            else if(arr[i] == 'k' || arr[i] == 'K'){
                arr1[i] = 11;
            }
            else if(arr[i] == 'l' || arr[i] == 'L'){
                arr1[i] = 12;
            }
            else if(arr[i] == 'm' || arr[i] == 'M'){
                arr1[i] = 13;
            }
            else if(arr[i] == 'n' || arr[i] == 'N'){
                arr1[i] = 14;
            }
            else if(arr[i] == 'o' || arr[i] == 'O'){
                arr1[i] = 15;
            }
            else if(arr[i] == 'p' || arr[i] == 'P'){
                arr1[i] = 16;
            } 
            else if(arr[i] == 'q' || arr[i] == 'Q'){
                arr1[i] = 17;
            }
            else if(arr[i] == 'r' || arr[i] == 'R'){
                arr1[i] = 18;
            } 
            else if(arr[i] == 's' || arr[i] == 'S'){
                arr1[i] = 19;
            }
            else if(arr[i] == 't' || arr[i] == 'T'){
                arr1[i] = 20;
            }
            else if(arr[i] == 'u' || arr[i] == 'u'){
                arr1[i] = 21;
            }
            else if(arr[i] == 'v' || arr[i] == 'V'){
                arr1[i] = 22;
            }
            else if(arr[i] == 'w' || arr[i] == 'W'){
                arr1[i] = 23;
            }
            else if(arr[i] == 'x' || arr[i] == 'X'){
                arr1[i] = 24;
            }
            else if(arr[i] == 'Y' || arr[i] == 'Y'){
                arr1[i] = 25;
            }
            else if(arr[i] == 'z' || arr[i] == 'Z'){
                arr1[i] = 26;
            }
            else if(arr[i] == ' '){
                arr1[i] = 27;
            }
            else{
                System.out.println("Some character present in the word "+word+" is not supported :/ ");
            }
        }
        System.out.print("The encoded form of the word "+word +" is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr1[i]);
        }
    }
}
