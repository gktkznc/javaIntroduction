package classes;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};
        numbers1[0] = 10;
        numbers2 = numbers1;

        System.out.println(numbers2[0]);
    }
}
