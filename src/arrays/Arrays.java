package arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] clubs = new String[4];

        clubs[0] = "Galatasaray";
        clubs[1] = "Fenerbahçe";
        clubs[2] = "Beşiktaş";
        clubs[3] = "Trabzonspor";

        for(String club: clubs) {
            System.out.println(club);
        }

        System.out.println("-------------");

        for(int i = 0;i < clubs.length; i++) {
            System.out.println(clubs[i]);
        }

    }
}
