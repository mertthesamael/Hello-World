import java.util.Scanner ;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;

        System.out.print("Bir sayi giriniz : ") ;
        n = input.nextInt() ;

        for (int i=1; i <= n ; i++ ){

            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }





    }
}
