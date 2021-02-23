package Section2;

import static Section2.exam1.scn;

public class exam4 {

    public static void main(String[] args) {
        /*
            (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
            as gratuity and $11.5 as total.

            (Finans uygulaması: komisyon hesaplama) Kullanıcıdan ara toplam ve komisyon oranını isteyen, komisyon miktarı ve toplamı
            hesaplayıp gösteren bir program yazınız. Örneğin, kullanıcı ara toplamı 10 TL ve komisyon oranını 15% olarak girdiğinde program, komisyon miktarı 1.5 TL ve toplamı 11.5 TL olarak gösterir.

        */

        soru4();

    }

    public static void soru4(){

        System.out.println("Ara toplam ve komisyonu sırayla giriniz");
        System.out.print("Ara toplam:");
        double ara=scn.nextDouble();
        System.out.print("Komisyon:%");
        double kom=scn.nextDouble();

        kom=ara*(kom/100);
        ara+=kom;

        System.out.println("Komisyon:$"+kom+" Toplam:$"+ara);
    }



}

