import java.util.Scanner ;
public class UsluSayıHesaplama {
    public static void main(String[] args) {
        int n, k ;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi : ");
        n = input.nextInt();
        System.out.print("Us olacak sayi : ");
        k = input.nextInt() ;

        for (int i = 1 ; i<=k; i++) {
            total *= n ;
            
        }
        System.out.print("Cevap = " + total);




    }
}
