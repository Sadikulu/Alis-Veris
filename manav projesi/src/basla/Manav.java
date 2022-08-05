package basla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    public static void urunler() {
        List<String> manavUrunler = new ArrayList<>();
        List<Double> manavFiyat = new ArrayList<>();

        List<String> sepet = Secimler.sepet;

        ManavUrunler.urunler(manavUrunler, manavFiyat);

        Scanner scan = new Scanner(System.in);
        int urunSecim;
        if (Secimler.secim == 1) {
            System.out.println("lütfen ürün seçimini yapınız");
            for (int i = 0; i <= manavUrunler.size() - 1; i++) {
                System.out.println((i + 1) + " " + manavUrunler.get(i) + " " + manavFiyat.get(i) + "TL");
            }
            urunSecim = scan.nextInt();
            System.out.println("Kaç kg almak istiyorsunuz");
            int kg = scan.nextInt();
            Secimler.toplamFiyat += (kg * manavFiyat.get(urunSecim - 1));
            sepet.add(manavUrunler.get(urunSecim - 1));
            System.out.println(sepet);
            System.out.println("Toplam tutar : " + Secimler.toplamFiyat);
            for (int i = 0; i < 1; i++) {
                System.out.println("Devam etmek istiyormusunuz? T/F");
                String cevap = scan.next();
                if (cevap.equalsIgnoreCase("T")) {
                    for (int j = 0; j <1; j++) {
                        System.out.println("Aynı kategoride mi devam etmek istiyorsunuz? T/F");
                        String kcevap = scan.next();
                        if (kcevap.equalsIgnoreCase("T")) {
                            Manav.urunler();
                        } else if (kcevap.equalsIgnoreCase("F")) {
                            Secimler.secim();
                        }else {
                            System.out.println("Lütfen geçerli bir karakter giriniz");
                            j--;
                        }
                    }
                } else if (cevap.equalsIgnoreCase("F")) {
                    Odeme.odeme();
                } else {
                    System.out.println("Lütfen geçerli bir karakter giriniz");
                    i--;
                }
            }
        }
    }
}
