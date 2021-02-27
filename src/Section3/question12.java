package Section3;

import java.util.Random;
import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
               /*
        üç basamaklı sayılardan bir piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı alsın ve aşağıdaki kurallara göre
        kazancını göstersin:
        1. Eğer girilen sayı piyangoda kazanan sayı ile birebir aynısı ise; ödül 10 000 TL

        2. Eğer girilen sayının tüm basamakları piyangoda kazanan sayı ile aynı ise; ödül 3 000 TL

        3. Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise; ödül 1 000 TL
        */
        Random piyango=new Random();
        int p;
        Scanner scn=new Scanner(System.in);
        while(true) {
            while (true) {
                p = piyango.nextInt(1000);
                if (p < 100)
                    continue;
                else
                    break;
            }
            System.out.print("Lütfen bir tahmin de bulununuz:");
            int tahmin = scn.nextInt();
            if (tahmin < 100) {
                System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
                continue;
            }
            if (1000 < tahmin) {
                System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
                continue;
            }
            if (tahmin == p) {
                System.out.println("Sayıyı doğtu tahmin ettiniz Sayı:" + p + " Tahmin:" + tahmin + "ödül 10 000 tl");
                continue;
            }
            int[] basamaklar = new int[3];
            int[] basamaklar2 = new int[3];
            int p1 = p;
            int tahmin1 = tahmin;
            for (int i = 0; i < 3; i++) {
                basamaklar[i] = p1 % 10;
                p1 /= 10;
                basamaklar2[i] = tahmin1 % 10;
                tahmin1 /= 10;
            }
            int b = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (basamaklar[j] == -1)
                        continue;
                    else if (basamaklar2[k] == -1)
                        continue;
                    else if (basamaklar[j] == basamaklar2[k]) {
                        basamaklar[j] = -1;
                        basamaklar2[k] = -1;
                        b++;
                        break;
                    }
                }
            }
            if (b == 3)
                System.out.println("rakamları doğru bildin ödül 3000 Sayı:" + p + " Tahmin:" + tahmin);
            else
                System.out.println("Maalesef yanlış girdinizi Sayı:" + p + " Tahmin:" + tahmin);
        }
    }
}
