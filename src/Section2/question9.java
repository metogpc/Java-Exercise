package Section2;

import static Section2.question1.scn;

public class question9 {

    public static void main(String[] args) {
        /*
        (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in
        kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height
         in inches and displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

        (Sağlık: VKİ hesaplama) Vucüt Kitle İndeksi (VKİ) ideal kilonun hesaplanması için kullanılır. Kilogram olarak ağırlığınızın, metre cinsinden
        boy uzunluğunun karesine bölünmesiyle elde edilir. Kullanıcıdan ağırlığını pound ve boyunu inch olarak girmesini isteyen ve VKİ değerini
        gösteren bir program yazınız. Bir pound 0.45359237 kilogram ve bir inch 0.0254 metredir.

         */

        soru9();
    }

    public static void soru9(){
        // Vücut kitle endeksi: kg/m*m
        System.out.println("Boyunuzu metre cinsinden giriniz");
        double m=scn.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz");
        double kg=scn.nextDouble();
        double vki=kg/(m*m);
        System.out.println("Vücut kitle indeksiniz->"+vki);
        if(vki<18.5)
            System.out.println("İdeal kilonuzun altındasınız");
        else if(vki>18.5&&vki<25)
            System.out.println("Normal kilodasınız");
        else if(vki>=25&&vki<30)
            System.out.println("Fazla kilolusunuz");
        else
            System.out.println("Obezsiniz");


    }
}
