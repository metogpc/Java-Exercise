package Section3;

import java.util.Random;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        /*
        Kullanıcıyla yazı-tura tahmin oyunu oynayan bir program yazınız.Program rastgele 0 (tura) ya da 1 (yazı) değerlerini üretsin.
        Kullanıcıdan tahmini alınız ve doğru olup olmadığını gösteriniz.
        */
        System.out.println("*************Yazı  tura oyunua hoşgeldiniz*************");
        while(true){
            System.out.println("Lütfen bir tahmin de bulununuz Yazı mı? Tura mı? Çıkış için q ye basınız");
            Scanner scn=new Scanner(System.in);
            String tahmin=scn.nextLine();
            Random r=new Random();
            boolean a=r.nextBoolean();
            String b;
            if(a==false)
                b="tura";
            else
                b="yazı";

            if(tahmin.equals("yazi")){
                if(a==true)
                    System.out.println("Tebrikler....");
                else{
                    System.out.println("Yanlış bildiniz "+b+" olucaktı...");
                }
            }
            else if(tahmin.equals("tura")){
                if(a==false)
                    System.out.println("Tebrikler....");
                else{
                    System.out.println("Yanlış bildiniz "+b+" olucaktı...");
                }
            }
            else if(tahmin.equals("q")){
                System.out.println("Programdan çıkış yapıldı...");
                break;
            }
            else
                System.out.println("Yanlış tuşa bastınız");

        }}

}
