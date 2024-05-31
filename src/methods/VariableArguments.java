package methods;

public class VariableArguments {

    public static void main(String[] args) {
        System.out.println(printCity());

        int number = total(7,5);
        System.out.println(number);

        int total = total2(1,3,4,5,7,8);
        System.out.println(total);
    }

    public static String printCity() {
        return "Ankara";
    }

    public static int total(int number1, int number2) {
        return number1 + number2;
    }

    public static int total2(int... numbers) { // variable arguments
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
