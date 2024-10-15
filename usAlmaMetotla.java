import java.util.Scanner;

public class usAlmaMetotla {
    public static class metot1 {
        static int power (int base , int exp) {
            int result = 1 ;
     for (int i = 1 ; i<=exp ; i++){
         result *= base;
     }
            return result;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Taban olacak sayıyı giriniz : ");
            int base = input.nextInt();
            System.out.println();
            System.out.print("Üs olacak sayıyı giriniz : ");
            int exp = input.nextInt();

            System.out.println("Sonuç = "+ power(base,exp));
        }
    }
}