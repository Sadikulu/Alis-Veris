package basla;

import java.util.List;
import java.util.Scanner;

public class MarketUrunler {

    public static void urunler(List<String> marketUrunler, List<Double> marketFiyat) {
        String[] urunlerArr = {"İkram", "Cips", "Tutku"
                , "Nutella", "Hobby", "Albeni", "BenimO", "Çekirdek"
                , "Dondurma", "Jelibon", "Tadelle"};
        double[] fiyatArr = {4.20, 9.10, 5.50, 25.80, 3.10
                , 3.20, 3.80, 6.00, 12.50, 5.70, 8.40};
        for (int i = 0; i < urunlerArr.length; i++) {
            marketUrunler.add(urunlerArr[i]);
            marketFiyat.add(fiyatArr[i]);
        }
    }

    public static void ekleme(List<String> marketUrunler, List<Double> marketFiyat) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ürünün adını giriniz");
        String yeni = scan.next();
        marketUrunler.add(yeni);
        System.out.println("Lütfen eklemek istediğiniz ürünün fiyatını giriniz");
        double yeniFiyat = scan.nextDouble();
        marketFiyat.add(yeniFiyat);
        System.out.println(marketUrunler);
        System.out.println(marketFiyat);
    }
}
