package basla;

import java.util.List;
import java.util.Scanner;

public class SarkuteriUrunler {

    public static void urunler(List<String> sarkuteriUrunler,List<Double> sarkuteriFiyat) {
        String[] urunlerArr = {"Pastırma", "Kavurma", "Sosis,"
                , "Sucuk", "Salam", "Tavuk", "Bonfile", "Köfte"
                , "Yumurta", "Zeytin", "Kaşar Peyniri"};
        double[] fiyatArr = {200.95, 125.30, 55.40, 152.95, 40.85
                , 65.90, 175.50, 85.40, 43.70, 32.80, 74.50};
        for (int i = 0; i < urunlerArr.length; i++) {
            sarkuteriUrunler.add(urunlerArr[i]);
            sarkuteriFiyat.add(fiyatArr[i]);
        }
    }
    public static void ekleme(List<String> sarkuteriUrunler,List<Double> sarkuteriFiyat){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ürünün adını giriniz");
        String yeni=scan.next();
        sarkuteriUrunler.add(yeni);
        System.out.println("Lütfen eklemek istediğiniz ürünün fiyatını giriniz");
        double yeniFiyat=scan.nextDouble();
        sarkuteriFiyat.add(yeniFiyat);
        System.out.println(sarkuteriUrunler);
    }
}
