import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int bakiye = 22104, miktar, pin , input1;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Portal Bank'a Hosgeldiniz");
        System.out.println("------------------------------");
        System.out.print("Pin giriniz: ");
        pin =input.nextInt();

        System.out.println("Güncel bakiyeniz : " +bakiye +"tl");

        while(bakiye>0){
            System.out.println();
            System.out.println("1- Para yatir");
            System.out.println("2- Para cek");
            System.out.println("3- Bakiye sorgulama");
            System.out.println("4- Cikis yap");
            System.out.println("Yapamk istediginiz islemi seciniz : ");

            input1 = scan.nextInt();

            if(input1==1){
                System.out.println("Yatirmak istediginiz miktari giriniz : ");
                miktar = scan.nextInt();
                bakiye += miktar ;
                System.out.println("Güncel bakiyeniz : "+ bakiye +"tl" );
                break;
            }
            else if (input1==2) {
                System.out.println("Cekmek istediginiz miktari giriniz : ");
                miktar = scan.nextInt();
                if (miktar>bakiye){
                    System.out.println("Yetersiz bakiye");
                }
                else{
                    bakiye -= miktar;
                    System.out.println("Güncel bakiyeniz : " + bakiye + "tl");
                }
                break;
            }
            else if (input1==3) {
                System.out.println("Bakiyeniz "+ bakiye + "tl" );
                break;
            }
            else if (input1==4) {
                System.out.println("Cikis yapiliyor ");
                break;
            }
            else {
                System.out.println("Gecersiz bir islem girdiniz");
                break;
            }
        }
        System.out.println("---------------------------");
        System.out.print("Tekrar Bekleriz");

    }
}