import java.util.Scanner;
//№1
//public class Main{
//    public static void main(String[] args) {
//    final double ROUBLES_PER_YUAN = 11.91;
//    int yuan;
//    double roubles;
//
//    Scanner scanner = new Scanner(System.in);
//
//    // Введем сумму юаней
//    System.out.print("Введите сумму юаней: ");
//    yuan = scanner.nextInt();
//
//    // Перевод юаней в рубли
//    roubles = ROUBLES_PER_YUAN * yuan;
//    System.out.println("Рублей = " + Math.ceil(roubles));
//
//    }
//}

//№2
public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan, digit;
        double roubles;

        Scanner scanner = new Scanner(System.in);

        // Введем сумму юаней
        System.out.print("Введите сумму юаней: ");
        yuan = scanner.nextInt();

        // Перевод юаней в рубли
        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);

        digit = yuan % 10;
        if (digit == 1 && (yuan / 10 == 0 || yuan / 100 != 0)){
            System.out.println(yuan + " китайский юань равно " + roubles + " рублям");
        }
        else if (digit == 2 || digit == 3 || digit == 4 || (digit == 1 && (yuan / 10) % 10 == 0)){
            System.out.println(yuan + " китайский юаня равно " + roubles + " рублям");
        }
        else {
            System.out.println(yuan + " китайских юаней равно " + roubles + " рублям");
        }

    }
}