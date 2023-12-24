public class StringToIntegerExample {
    public static void main(String[] args) {
        // Method 1: Using parseInt method
        String strNumber1 = "123";
        int number1 = Integer.parseInt(strNumber1);
        System.out.println("Method 1 - Converted Integer: " + number1);

        // Method 2: Using valueOf method
        String strNumber2 = "456";
        Integer number2 = Integer.valueOf(strNumber2);
        System.out.println("Method 2 - Converted Integer: " + number2);
    }
}
