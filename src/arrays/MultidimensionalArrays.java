package arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Ankara";
        cities[0][2] = "İzmir";
        cities[1][0] = "Sakarya";
        cities[1][1] = "Van";
        cities[1][2] = "Rize";
        cities[2][0] = "Edirne";
        cities[2][1] = "Gaziantep";
        cities[2][2] = "Şanlıurfa";

        for(int i = 0; i < cities.length; i++) {
            System.out.println("------------");
            for(int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }

}
