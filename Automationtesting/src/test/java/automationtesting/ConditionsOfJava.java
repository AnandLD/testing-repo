package automationtesting;

public class ConditionsOfJava {

    public static void main(String[] args) {

        int firstNumber = 24;
        int secondNumber = 30;

        if (firstNumber == secondNumber) {

            System.out.println("two numbers are equal");
        } else if (firstNumber > secondNumber) {

            System.out.println("first number is not greater than second number");

        } else {

            System.out.println("first is smaller than second number");
        }


        String nameOne = "Anand";
        String nameTwo = "anand";

        if (nameOne.equals(nameTwo)) {
            System.out.println("Both are equal");
        }

        else {

            System.out.println("Both are not equal");
        }
    }
}
