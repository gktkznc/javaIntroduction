package methods;

public class FindingNumber {

    public static void main(String[] args) {
        findingNumber();
    }

    public static void findingNumber() {
        int[] numbers = {1,2,5,4,7,10};

        int checkedNumber = 4;

        boolean isAvailable = false;

        for(int number: numbers) {
            if(checkedNumber == number) {
                isAvailable = true;
            }
        }

        if(isAvailable) {
            printMessage("Numara mevcuttur: " + checkedNumber);
        } else {
            printMessage("Numara mevcut değildir: " + checkedNumber);
        }
    }

    public static void printMessage(String str) {
        System.out.println(str);
    }
}
