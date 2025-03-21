import java.util.Scanner;
public class BigWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any big word");
        String word = input.nextLine();
        System.out.println("The unique words in the given word ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) == i)
                System.out.println(ch);
        }

        System.out.println("The number of occurrences of the given word");
        for(int i = 0; i<word.length();i++ ) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == ch) {
                    count++;
                }
            }

                if (word.indexOf(ch) == i) {
                    System.out.println(ch + " " + count + "times");

                }
            }


        String reversed = " ";
        for( int i=word.length()-1;i>=0 ;i--){ // to reverse the loop
          reversed += word.charAt(i);

        }
        System.out.println(" The reversed word of the given word" + reversed);


        int mid = word.length() / 2;
        String firstHalf = word.substring(0,mid);
        String secondHalf = word.substring(mid);
        System.out.println("The secondhalf of the given word " + secondHalf);
        System.out.println("The firsthalf of the given word " + firstHalf);

//        String str = word;
//        String ans = new StringBuilder(str).reverse().toString(); // another method to reverse the string
//        System.out.println(ans);

    }

}





