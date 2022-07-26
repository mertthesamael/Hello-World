import java.util.Scanner ;
public class UserLogin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, secretAnsewer, newPassword, userName2, password2;
        int reset;

        System.out.print("Kullanici adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))) {

            System.out.println("Giris basarili");

        } else {
            System.out.println("Hatali giris yaptiniz");
            System.out.println("Sifrenizi sifirlamak icin 0'a basin");
            reset = inp.nextInt();

            if (reset == 0) {
                System.out.println("Lutfen gizli sorunuzun cevabini yazin");
                System.out.println("Evcil hayvaninizin adi nedir ?");
                inp.nextLine();
            }

            secretAnsewer = inp.nextLine();

            if (secretAnsewer.equals("badem"))

                System.out.println("Yeni sifrenizi giriniz");


            newPassword = inp.nextLine();
            System.out.println("Sifreniz degistirilmistir. Lutfen tekrar giris yapin. ");


            System.out.print("Kullanici adiniz : ");
            userName2 = inp.nextLine();

            System.out.print("Sifreniz : ");
            password2 = inp.nextLine();

            boolean durum = (userName2.equals("patika")) && (password2.equals(newPassword)) ;

                   String of = durum ? "Giris basarili" : "Hatali giris lutfen daha sonra tekrar deneyiniz." ;

            System.out.println(of);














        }


    }
}





