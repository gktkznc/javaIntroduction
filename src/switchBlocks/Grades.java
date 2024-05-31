package switchBlocks;

public class Grades {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel. Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi. Geçtiniz");
                break;
            case 'C':
                System.out.println("Güzel. Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil. Geçtiniz");
            case 'F':
                System.out.println("Başarısız. Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girişi");
                break;
        }
    }

}
