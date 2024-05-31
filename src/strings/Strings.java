package strings;

public class Strings {
    public static void main(String[] args) {
        String str = "İklimler son yıllarda çok dengesizleşti.";

        for(String word: str.split(" ")) {
            System.out.println(word);
        }

        System.out.println();

        String newStr = str.replace(' ', '-');
        System.out.println(newStr);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("Eleman sayısı: " + str.length());
        System.out.println("10. eleman: " + str.charAt(9));
        System.out.println(str.concat(" Bu durum endişe verici"));
        System.out.println(str.startsWith("İ"));
        System.out.println(str.endsWith("."));

        System.out.println();

        char[] characters= new char[3];
        str.getChars(9, 12, characters, 0);
        System.out.println(characters);

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

    }
}
