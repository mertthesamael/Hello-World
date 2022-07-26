import java.util.Scanner ;
public class LunarYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int date ;
        String lunarZodiac = "" ;

        System.out.print("Dogum yilinizi giriniz : ");
        date = input.nextInt();
/**
 * @m.Enercan
 * Girilen tarihlerin 12ye bölümünden kalan değerlere göre Çin yılı burcu :
 */
        if (date %12 == 0){
            System.out.println("Maymun");

        }else if (date %12 == 1){
            System.out.println("Horoz");
        }else if (date %12 == 2){
            System.out.println("Kopek");
        }else if (date %12 == 3){
            System.out.println("Domuz");
        }else if (date %12 == 4){
            System.out.println("Fare");
        }else if (date %12 == 5){
            System.out.println("Okuz");
        }else if (date %12 == 6){
            System.out.println("Kaplan");
        }else if (date %12 == 7){
            System.out.println("Tavsan");
        }else if (date %12 == 8){
            System.out.println("Ejderha");
        }else if (date %12 == 9){
            System.out.println("Yılan");
        }else if (date %12 == 10){
            System.out.println("At");
        }else if (date %12 == 11){
            System.out.println("Koyun");
        }






    }
}
