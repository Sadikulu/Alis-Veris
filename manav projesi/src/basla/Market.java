package basla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

    public static void urunler() {
        List<String> marketUrunler = new ArrayList<>();
        List<Double> marketFiyat = new ArrayList<>();

        List<String> sepet = Secimler.sepet;

        MarketUrunler.urunler(marketUrunler,marketFiyat);

        Scanner scan = new Scanner(System.in);
        int urunSecim;
        if (Secimler.secim==3) {
            System.out.println("lütfen ürün seçimini yapınız");
            for (int i = 0; i <= marketUrunler.size() - 1; i++) {
                System.out.println((i + 1) + " " + marketUrunler.get(i) + " " + marketFiyat.get(i) + "TL");
            }
            urunSecim = scan.nextInt();
            System.out.println("Kaç adet almak istiyorsunuz");
            int adet = scan.nextInt();
            Secimler.toplamFiyat+= (adet * marketFiyat.get(urunSecim - 1));
            sepet.add(marketUrunler.get(urunSecim - 1));
            System.out.println(sepet);
            System.out.println("Toplam tutar : " + Secimler.toplamFiyat);
            for (int i = 0; i <1 ; i++) {
                System.out.println("Devam etmek istiyormusunuz? T/F");
                String cevap = scan.next();
                if (cevap.equalsIgnoreCase("T")) {
                    for (int j = 0; j <1; j++) {
                        System.out.println("Aynı kategoride mi devam etmek istiyorsunuz? T/F");
                        String kcevap = scan.next();
                        if (kcevap.equalsIgnoreCase("T")) {
                            Market.urunler();
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
