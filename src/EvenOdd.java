import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Starting Number");
        int startingNum = input.nextInt();
        System.out.println("Enter Ending number ");
        int endingNum = input.nextInt();
        System.out.println("Print all Numbers from  start to end :" + startingNum + " , " + endingNum);
        for (int i = startingNum; i <= endingNum; i++) {
            System.out.println(i);
        }
        int evenNumbers[] = new int[endingNum - startingNum + 1];
        int oddNumbers[] = new int[endingNum - startingNum + 1];

        if(startingNum >= endingNum)
        {
            System.out.println("Please enter valid input - starting number should not be less than ending number");
            return;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = startingNum; i <= endingNum; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenCount] = i;
                evenCount++;
                System.out.println("Even numbers:" + i);
            }
            else{
                oddNumbers[oddCount] = i;
                oddCount++;
                System.out.println("Odd numbers:" + i);

            }
        }

        System.out.println("Even numbers stored in array");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(evenNumbers[i]);
        }
        System.out.println("Odd numbers stored in array");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(oddNumbers[i]);

        }
    }
}





