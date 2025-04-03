import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class AssignmentList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Starting number");
        int startingNumber = input.nextInt();
        System.out.println("Enter Ending number");
        int endingNumber = input.nextInt();
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> OddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

for( int i = startingNumber; i<=endingNumber;i++) {
    mainList.add(i);

    if (i % 2 == 0) {
        evenList.add(i);
    } else {
        OddList.add(i);
    }
}



 System.out.println("The numbers added to mainList" + mainList);
    System.out.println("The numbers added to evenList" + evenList);
    System.out.println("The numbers added to oddList" + OddList);
    }
            }

