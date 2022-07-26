import java.util.Scanner ;
public class TotalOddNumber {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in) ;
        int n ;
        int total = 0 ;

        do {
            System.out.print("Sayi girin : ");
            n = inpu.nextInt();
            if (n % 2 == 1){
                total += n ;
            }
        }while (n > 0) ;
        System.out.print("Toplam : " + total);

    }
}
