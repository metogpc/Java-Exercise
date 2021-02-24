package Section2;

import static Section2.question1.scn;

public class question8 {

    // İvmesi a ve iniş anındaki hızı v olan bir uçak için gerekli en az pist mesafesini hesaplamak için aşağıdaki formülü kullanabilirsiniz : length=v*v/2a

    public static void main(String[] args) {
        /*
        (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needd
         for an airplane to take off using the following formula:
        (Fizik: iniş mesafesi) İvmesi a ve iniş anındaki hızı v olan bir uçak için gerekli en az pist mesafesini hesaplamak için aşağıdaki formülü
         kullanabilirsiniz :

        Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2), and displays the
        minimum runway length.
        Kullanıcıdan hızı v (metre/saniye) ve ivmeyi a (metre/saniye kare) alan ve gerekli en az pist mesafesini hesaplayan bir program yazınız.
        */

        soru8();

    }


    public static void soru8(){

        System.out.println("Uçağın hzını giriniz");
        double v=scn.nextDouble();
        System.out.println("Uçağın ivmesini giriniz");
        double a=scn.nextDouble();
        double l=Math.pow(v, 2)/2*a;

        System.out.println("Gereken pist uzunluğu:"+l);

    }
}
