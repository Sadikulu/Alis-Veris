package basla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UrunEkleme_Cikarma {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        List<Double> fiyat = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün eklemek istediğiniz reyonu seçiniz\n"
                + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market");
        int secim = scan.nextInt();
        if (secim == 1) {
           // ManavUrunler.ekleme(urunler, fiyat);
        } else if (secim == 2) {
            SarkuteriUrunler.ekleme(urunler, fiyat);
        } else if (secim == 3) {
            MarketUrunler.ekleme(urunler, fiyat);
        }
    }
}
