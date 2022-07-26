import java.util.Scanner ;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, t, e, f, b;
        double ort;
        System.out.print("Matematik notunuzu girin : ");
        m = input.nextInt();

        System.out.print("Tarih notunuzu girin : ");
        t = input.nextInt();

        System.out.println("Edebiyat notunuzu girin : ");
        e = input.nextInt();

        System.out.println("Fizik notunuzu girin : ");
        f = input.nextInt();

        System.out.println("Biyoloji notunuzu grin");
        b = input.nextInt();

        ort = (m + t + e + f + b) / 5;

        if (ort > 55) {
            System.out.println("Tebrikler, gectin ! ");
        } else if (ort == 55) {
            System.out.println("Gectin ama sinir puandasin, seneye daha iyi hazirlan !");
        } else

            System.out.println("Malesef gecemedin.. Daha cok calismalisin. :( ");



    }

}
