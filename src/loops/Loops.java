package loops;

public class Loops {

    public static void main(String[] args) {
        // for loops
        for(int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        int i = 1;
        while(i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");

        int j = 0;

        do {
            System.out.println(j);
            j++;
        }while(j <= 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
