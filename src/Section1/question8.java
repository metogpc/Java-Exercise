package Section1;

import java.util.Scanner;

public class question8 {
    /*
    (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
    (Alan ve çevre hesaplama) 5.5 yarı çapında bir çemberin çevresini ve alanını hesaplayan bir program yazınız. Hesaplama için aşağıdaki formülleri kullanınız:
    */

    public static void main(String[] args) {
        soru8();
    }

    public static void soru8(){
        double r;
        Scanner scn=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz  r:");
        r=scn.nextDouble();

        double alan=Math.PI*r*r;
        double cevre=Math.PI*2*r;

        System.out.println("Alan:"+alan+" Çevre:"+cevre);

    }
}
