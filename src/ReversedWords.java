import java.util.Scanner;
public class ReversedWords {
    public static void main(String[] args) {
        System.out.println("Enter the Sentence");
        Scanner input = new Scanner(System.in);
        String Sentence = input.nextLine();

        String reversed = new StringBuilder(Sentence).reverse().toString();
        System.out.println(reversed);
    }
    }
    // another method in loop
//String reversed = " ";
//for( int i = sentence.length()-1;i>=0;i--){
//    reversed+=Sentence.charAT[i];
//        }
//        System.out.println(reversed);




