import java.util.Scanner ;
public class TemperatureEvent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int heat ;

        System.out.print("Sicaklik giriniz : ");
        heat = input.nextInt();

        if (heat < 5 ){
            System.out.println("Kayak yapabilirsin ! ");
        } else if (heat > 5 && heat < 16) {
            System.out.println("Sinemaya gidebilirsn ! ");
        } else if (heat >= 10 && heat <24) {
            System.out.println("Piknik yapabilirsin !");
        } else if (heat >= 25 ){
            System.out.println("Yuzmeye gidebilirsin !");
        }




    }
}
