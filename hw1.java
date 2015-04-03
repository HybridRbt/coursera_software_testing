public class HW1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int expectedNumber = 3;

        System.out.println("Testing function Add.\n");
        System.out.println("First number is: " + number1 +"\n");
        System.out.println("Second number is: " + number2 +"\n");

        int re = Add(number1, number2);

        System.out.println("Expected Result is: " + expectedNumber +"\n");
        System.out.println("Actual Result is: " + re +"\n");
    }

    public int Add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

