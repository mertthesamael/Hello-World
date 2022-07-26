import java.util.Scanner ;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double km ;
        int age ;
        double total ;
        int type ;
        double kmPrice = 0.10 ;


        System.out.print("Mesafeyi km cinsinden giriniz : ") ;
                km = input.nextInt();
        System.out.print("Yasinizi giriniz : ");
                age = input.nextInt();
        System.out.print("Yolculuk tipini seciniz (1 -> Tek Yon 2 -> Gidis Donus) : ");
                type = input.nextInt();
         if ((km > 0) && (age >0) && (type >=1 && type <3)){



          if (age < 12 ) {
              if (type == 2) {
                  total = (km * kmPrice) * 0.50 - (km * kmPrice) * 0.20;
              } else
                  total = (km * kmPrice) * 0.50;

              if (age >= 12 && age <= 24) {
                  if (type == 2) {
                      total = (km * kmPrice) * 0.10 - (km * kmPrice) * 0.20;
                  } else {
                      total = (km * kmPrice) * 0.10;
                  }
              }



          }else if ( age > 64 ) {
               if (type == 2) {
                  total = (km * kmPrice) * 0.50;
                   System.out.println("Toplam tutar = " + total + " TL");
                } else {
                  total = (km * kmPrice) * 0.30;
                   System.out.println("Toplam tutar = " + total + " TL");
              }
          }

                     else if (age > 35 && age < 65 ){
                        if (type == 2) {
                total = (km * kmPrice) * 0.80;
            } else {
                total = km * kmPrice;
            }

            System.out.println("Toplam tutar = " + total + " TL");
           }
          } else
            System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyin");


        }



    }

