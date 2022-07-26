import java.util.Scanner ;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select ;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Ilk sayiyi giriniz : ") ;
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.println("Yapmak istedigin islemi sec : ");
        System.out.println(" 1 : Toplama \n 2 : Cikarma \n 3 : Carpma \n 4 : Bolme " ) ;
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.println(n1+n2);
                break;
            case 2 :
                System.out.println(n1-n2);
                break;
            case 3 :
                System.out.println(n1*n2);
                break;
            case 4 :
                if (n2 == 0){
                System.out.println("Bir sayi 0'a bolunemez.");
            }

                else
                System.out.println(n1/n2);

                break;



        }




    }
}
