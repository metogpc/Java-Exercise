package Section1;

import java.util.Scanner;

public class question10 {

    public static void main(String[] args) {
        /*
        (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the
        average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)

        (Mil cinsinden ortalama hız) Bir koşucunun  14 kilometreyi  45 dakika 30 saniyede koştuğunu varsayalım Ortalama hızı
        mil/saat cinsinden gösterecek bir program yazınız. ( 1 mil, 1.6 kilometredir.)
        */
        soru10();
    }

    static void soru10(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Yolunuzun kaç km olduğunu yazınız");
        double km=scn.nextDouble();
        System.out.println("Yolunuzun kaç saat dk ve sn olarak yazınız");
        System.out.print("Saat:");
        double saat=scn.nextDouble();
        System.out.print("Dakika:");
        double dk=scn.nextDouble();
        System.out.println("Saniye:");
        double sn=scn.nextDouble();

        sn=sn+dk*60+saat*3600;

        double hiz=km/(sn/3600);

        System.out.println("Hızınız:"+(int)hiz+"km/h");
        System.out.println("Hızınız:"+(int)(hiz/1.6)+"mil/h");
    }

}
