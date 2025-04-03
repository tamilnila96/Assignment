import java.util.Scanner;
public class TemptoCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'C' to convert temp to Farenheit or in 'F' to convert to celsius");
        char conversion;
        conversion = input.next().toUpperCase().charAt(0);

        System.out.println("Enter your temperature value");
        double temp = input.nextDouble();

        double convertedTemp;

        if(conversion== 'C'){
            convertedTemp =(temp*9/5)*32;
            System.out.println("Temperature in celsius" + convertedTemp);
        }
        else if(conversion== 'F'){
            convertedTemp =(temp-32)*5/9;
            System.out.println("Temperature in celsius" + convertedTemp);
        }
        else{
            System.out.println("ENter valid input");
        }



    }
}