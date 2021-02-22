package Section1;

import java.util.Scanner;

public class exam12 {

    public static void main(String[] args) {
        /*
        (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that
        displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

        (Kilometre cinsinden ortalama hız) Bir koşucunun 24 mili 1 saat, 40 dakika, 35 saniyede koştuğunu varsayalım. Ortalama
        hızı km/saat cinsinden gösterecek bir program yazınız. ( 1 mil, 1.6 kilometredir.)
        */
        soru12();
    }

    static void soru12(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Yolunuzun kaç mil olduğunu yazınız");
        double mil=scn.nextDouble();
        System.out.println("Yolunuzun kaç saat dk ve sn olarak yazınız");
        System.out.print("Saat:");
        double saat=scn.nextDouble();
        System.out.print("Dakika:");
        double dk=scn.nextDouble();
        System.out.println("Saniye:");
        double sn=scn.nextDouble();

        sn=sn+dk*60+saat*3600;

        double km=mil*1.6;

        double hiz=km/(sn/3600);

        System.out.println("Hızınız:"+(int)hiz+"km/h");

    }
}
