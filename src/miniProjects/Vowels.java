package miniProjects;

public class Vowels {
    public static void main(String[] args) {
        char vowel = 'E';

        switch (vowel) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Sessiz harf");
                break;

        }
    }
}
