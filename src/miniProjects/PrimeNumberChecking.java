package miniProjects;

public class PrimeNumberChecking {

    public static void main(String[] args) {
        int number = 23;

        boolean isPrime = true;

        if(number == 1) isPrime = false;

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if(number < 1) {
            System.out.println("Geçersiz sayı");
        } else if(isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }

    }
}
