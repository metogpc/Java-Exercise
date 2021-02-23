package Section2;

import java.util.Scanner;

public class exam7 {
    /*
        (Physics: acceleration) Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in the following formula:

        (Fizik: ivme) Aşağıdaki formülde gösterildiği gibi, ortalama ivme hızdaki değişimin zamana bölünmesiyle elde edilir.

        Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.

        Kullanıcıdan ilk hızı (v0) metre/saniye, son hızı (v1) metre/saniye ve zamanı (t) saniye olarak alan ve ortalama ivmeyi gösteren bir program yazınız.
     */

    public static void main(String[] args) {

        soru7();

    }

    public static void soru7(){

        int ilk;
        int son;
        Scanner scn =new Scanner(System.in);
        System.out.println("İlk hızı giriniz");
        ilk=scn.nextInt();
        System.out.println("Son hızı giriniz");
        son=scn.nextInt();
        System.out.println("Toplam zamanı giriniz");
        int t=scn.nextInt();
        double a=(son-ilk)/t;
        System.out.println("Ortalama ivme:"+a);
    }
}
