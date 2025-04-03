import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double  weight= input.nextDouble();
        System.out.println("Enter height in cm");
        double height = input.nextDouble();
        double heightmeters = height/100;
        double BMI;
        BMI = weight/ (heightmeters*heightmeters);
        System.out.println(BMI);
        if(BMI< 18.5){
            System.out.println("You are underweight");
        }
        else if(BMI <=24.9 && BMI >=18.5){
           System.out.println("Normal");
       }

       else if (BMI >=25 & BMI<= 29.9){

            System.out.println("You are Overweight");
        }
       else{
            System.out.println("You are obese");
        }

    }
}


