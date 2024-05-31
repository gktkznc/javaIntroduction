package miniProjects;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;

        for(int i = 1; i <number; i++) {
            if(number % i == 0) {
                sum +=i;
            }
        }

        if(sum == number) {
            System.out.println(number + " mükemmel sayı");
        } else {
            System.out.println(number + " Mükemmel sayı değil");
        }
    }
}
