package Section1;

import java.util.Scanner;

public class exam9 {
    public static void main(String[] args) {

        /*
        (Area and perimeter of a rectangle)Write a program that displays the area and
        perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:

        (Dikdörtgenin alanı ve çevresini hesaplama) Aşağıdaki formülü kullanarak bir dikdörtgenin
        alanını hesaplayınız genişliği 4.5 , yüksekliği 7.9 olarak alınız:
        */

        soru9();

    }

    public static void soru9(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Uzunluğu ve benişliği sırayla giriniz");
        int uzun=scn.nextInt();
        int kisa=scn.nextInt();
        int alan=uzun*kisa;

        System.out.println("Alan:"+alan);
    }

}
