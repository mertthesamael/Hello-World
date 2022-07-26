import java.util.Scanner ;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int n ;
        int total = 1 ;
        int r ;
        int toplam1=1;
        int toplam2=1;


        System.out.print("Sayi giriniz : ");
        n = input.nextInt();
        System.out.print("Ikinci kumeyi giriniz : ");
        r = input.nextInt();

            for (int i = 1; i <= n; i++) {
                total = total * i;

            }
            for (int j = 1; j <= r; j++) {
                toplam1 = toplam1 * j;
            }
            for (int k = 1; k <= (n - r); k++) {
                toplam2 = toplam2 * k;
            }
            double c = total / (total * toplam2);


            System.out.println(c);


    }
}
