import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Boolean devam = true;
        double toplamTutar = 0;
        double urunFiyatlari = "33.45, 7.99 , 72.5 , 126.5 , 16.9 , 10.99 , 99.99" ;
        String urunler = "yogurt,ekmek,sampuan,camasirYumusaticisi,cikolata,cubukKraker,arapSabunu";

        System.out.println("----Hosgeldiniz----");

        System.out.println("Urunler : ");
        for (int i=0; i<urunler.length();i++){
            System.out.println((i+1) + "." + urunler[i] + "-->" + urunFiyatlari[i] + "tl");
        }

        System.out.println(" ");

        while (devam){
            System.out.println("Bir urun seciniz: 1-" + urunler.length()+ "arasinda");
             int secim = scan.nextInt();
             if (secim >= 1 && secim <= urunler.length() ){
                 System.out.println("Kac adet" + );
             }




        }


    }
}