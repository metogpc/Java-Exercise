package Section2;

import static Section2.exam1.scn;

public class exam3 {
    /*
    (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the result.
     One foot is 0.305 meter.
    (Feet - metre dönüşümü) Kullanıcıdan feet değerini alan ve bunun metre karşılığını hesaplayıp gösteren bir program yazınız.
    Bir feet 0.305 metredir.
     */

    public static void main(String[] args) {

    }

    public static void soru3(){

        System.out.print("Bie feet değeri giriniz:");
        double feet=scn.nextDouble();
        double m=feet*0.305;

        System.out.println(feet+"="+m+" dir");
    }
}
