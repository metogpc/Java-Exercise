package Section2;

import java.util.Scanner;

public class question1 {
    /*
    (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula
    for the conversion is as follow
    (Santigrat Fahrenhayt Dönüşümü) Konsoldan double türünde Santigrat değerini alan ve bunu Fahrenhayt olarak gösteren
    bir program yazınız. Dönüşüm için aşağıdaki formülü kullanabilirsiniz:
    */

    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {

        soru1();

    }

    public static void soru1(){

        System.out.print("Santigrat olarak bir derece giriniz:");
        int c=scn.nextInt();
        double f=c*1.8+32;

        System.out.println(c+" Santigrat "+f+" Fahrenheittir");
    }
}


