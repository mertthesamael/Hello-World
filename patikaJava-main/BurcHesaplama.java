import java.util.Scanner ;

/**
 * Girilen gün ve tarihlere göre burç çıktısı alma programı.
 * @author M.Enercan
 */
public class BurcHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int month, day ;
        String burc = "" ;


        System.out.print("Dogdugunuz ay : ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();
        if ((month >= 1 && month <= 12) && (day > 0 && day < 32 )) {



            if (month == 1 && day <= 31) {
                if (day > 21) {
                    burc = "Kova";
                } else
                    burc = "Oglak";
            }
            if (month == 2 && day <= 28) {
                if (day > 19) {
                    burc = "Balik";
                } else
                    burc = "Kova";
            }

            if (month == 3 && day < 31) {
                if (day <= 20) {
                    burc = "Balik";
                } else
                    burc = "Koc";
            }

            if (month == 4 && day < 30) {
                if (day <= 20) {
                    burc = "Koc";
                } else
                    burc = "Boga";
            }

            if (month == 5 && day < 31) {
                if (day <= 21) {
                    burc = "Boga";
                } else
                    burc = "İkizler ";

            }

            if (month == 6 && day < 30) {
                if (day < 22) {
                    burc = "Ikizler";
                } else
                    burc = "Yengec";
            }

            if (month == 7 && day < 31) {
                if (day <= 22)
                    burc = "Yengec";
                else
                    burc = "Aslan";
            }
            if (month == 8 && day < 31) {
                if (day <= 22)
                    burc = "Aslan";
                else
                    burc = "Basak";
            }
            if (month == 9 && day < 30) {
                if (day <= 22)
                    burc = "Basak";
                else
                    burc = "Terazi";
            }

            if (month == 10 && day < 31) {
                if (day <= 22)
                    burc = "Terazi";
                else
                    burc = "Akrep";

            }

            if (month == 11 && day < 30) {
                if (day <= 21)
                    burc = "Akrep ";
                else
                    burc = "Yay";

            }

            if (month == 12 && day < 31) {
                if (day <= 21)
                    burc = "Yay";
                else
                    burc = "Oglak";
            }

                   System.out.println("Burcunuz : " + burc);
        }
        else
        System.out.println("Hatali giris yaptiniz");


            }
    }

