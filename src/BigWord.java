import java.util.Scanner;
public class BigWord {
    public static <str> void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any big word");
        String [] words = words.split("s ");
        str = input.nextLine();
        System.out.println("The unique words in the given word ");
        for( int i =0; i<words.length; i++){
            boolean isUnique = true;
            for( int j = 0; j<words.length;j++){
                if(i==j) {
                    break;
                }



                if( i != j){
                    System.out.println(i);
                }
            }


        }

    }
}
