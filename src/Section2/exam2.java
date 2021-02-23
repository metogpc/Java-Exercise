package Section2;

import java.util.Scanner;

import static Section2.exam1.scn;

public class exam2 {
    public static void main(String[] args) {
        /*
        Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes the area and volume using the
        following formulas:
        (Silindirin hacmi) Kullanıcıdan silindirin yarıçap ve yükseklik değerini isteyen ve aşağıdaki formüle göre alanını ve
        hacmini hesaplayan bir program yazınız:
         */

        soru2();

    }
    public static void soru2(){

        System.out.println("Silindirin yarıçapını ve yüksekliği giriniz");
        System.out.print("Yarıçap:");
        int r=scn.nextInt();
        System.out.print("Yükseklik:");
        int h=scn.nextInt();

        double a=Math.PI*r*r;
        double v=a*h;

        System.out.println("Alan:"+a+" Hacim:"+v);


    }
}
