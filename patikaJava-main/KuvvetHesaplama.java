import java.util.Scanner ;
public class KuvvetHesaplama {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        int n ;
        int n1 ;
        int n2;
        System.out.print("Sayi girinn : ");
        n = inpu.nextInt();

        System.out.print("4un kuvvetleri : ");
        for (int i = 1 ; i <= n ; i*=4){

            System.out.print(i + " ");
        }

        System.out.print("\n5in kuvvetleri : ");
        for (int i = 1 ; i <= n ; i*=5) {

            System.out.print(i + " ");
        }

    }
}
