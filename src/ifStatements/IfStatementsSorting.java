package ifStatements;

public class IfStatementsSorting {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 30;
        int theGreatest = number1;

        if(number2 < number1) {
            theGreatest = number1;
        }

        if(number2 < number3) {
            theGreatest = number3;
        }

        System.out.println("En büyük: " + theGreatest);
    }
}
