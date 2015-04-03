public class HW1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int expectedNumber = 3;

        System.out.println("Testing function Add.\n");
        System.out.println("First number is: " + number1);
        System.out.println("Second number is: " + number2);

        int re = Add(number1, number2);

        System.out.println("Expected Result is: " + expectedNumber);
        System.out.println("Actual Result is: " + re);
    }

    public int Add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

