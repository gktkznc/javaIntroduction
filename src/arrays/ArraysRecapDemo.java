package arrays;

public class ArraysRecapDemo {

    public static void main(String[] args) {
        double[] numbers = {1.2,3.1,1.4,2.2};
        double sum = 0;
        double max = numbers[3];
        double min = numbers[1];

        for(double number: numbers) {
            System.out.println(number);
            sum+= number;
            if(max < number) {
                max = number;
            }
            if(min > number) {
                min = number;
            }
        }

        System.out.println("Toplam: " + sum);

        System.out.println("Max: " + max);

        System.out.println("Min: " + min);
    }

}

