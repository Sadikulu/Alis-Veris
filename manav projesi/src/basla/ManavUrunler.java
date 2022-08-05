package basla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavUrunler {
        public static List<String> manavUrunler =new ArrayList<>();
        public static List<Double> manavFiyat =new ArrayList<>();
    public static void urunler(List<String> manavUrunler, List<Double> manavFiyat) {

        String[] urunlerArr = {"Domates", "Patates", "Biber"
                , "Soğan", "Havuç", "Elma", "Muz", "Çilek"
                , "Kavun", "Üzüm", "Limon"};
        double[] fiyatArr = {2.10, 3.20, 1.50, 2.30, 3.10
                , 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};
        for (int i = 0; i < urunlerArr.length; i++) {
            manavUrunler.add(urunlerArr[i]);
            manavFiyat.add(fiyatArr[i]);
        }

    }

    public static String[] urunEkleme(String[] urunlerArr) {
        String[] arr = new String[urunlerArr.length + 1];
        for (int i = 0; i < urunlerArr.length; i++) {
            arr[i] = urunlerArr[i];
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ürünün adını giriniz");
        String yeni = scan.next();
        arr[arr.length - 1] = yeni;
        return arr;
    }

    public static double[] fiyatEkleme(double[] fiyatArr) {
        double[] arr = new double[fiyatArr.length + 1];
        for (int i = 0; i < fiyatArr.length; i++) {
            arr[i] = fiyatArr[i];
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ürünün fiyatını giriniz");
        double yeniFiyat = scan.nextDouble();
        arr[arr.length - 1] = yeniFiyat;
        return arr;
    }
}