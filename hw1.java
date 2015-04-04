public class HW1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int expectedAddNumber = 3;
        int expectedSubNumber = -1;

        System.out.println("Testing functions Add and Subtract.\n");
        System.out.println("First number is: " + number1);
        System.out.println("Second number is: " + number2);

        int reAdd = Add(number1, number2);
        int reSub = Sub(number1, number2);

        System.out.println("\nFor Add function:\n");
        System.out.println("Expected Result is: " + expectedAddNumber);
        System.out.println("Actual Result is: " + reAdd);

        System.out.println("\nFor Sub function:\n");
        System.out.println("Expected Result is: " + expectedSubNumber);
        System.out.println("Actual Result is: " + reSub);
    }

    public static int Add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int Sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}



