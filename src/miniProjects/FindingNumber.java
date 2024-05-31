package miniProjects;

public class FindingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,6,7,10,13,25};

        int checkedNumber = 10;

        boolean isAvailable = false;

        for(int number: numbers) {
            if(number == checkedNumber) {
                isAvailable = true;
                break;
            }
        }

        if(isAvailable) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }
    }
}
