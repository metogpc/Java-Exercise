package Section2;

import static Section2.exam1.scn;

public class exam5 {
    /*
     (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
     (Tam sayının basamak değerlerinin toplamı) 0 ve 1000 aralığında bir tam sayı alan ve basamak değerlerinin toplamını gösteren bir program yazınız. Örneğin; Girilen tam sayı  932, ise basamak değerli toplamı 14’tür.

     */

    public static void main(String[] args) {
        soru5();
    }

    public static void soru5(){

        System.out.println("0 ile 1000 arasında bir sayı giriniz");
        int sayi=scn.nextInt();
        int top=0;
        if(sayi<10){
            top+=sayi;
        }
        else if(10<=sayi&&sayi<100){

            top+=sayi%10;
            top+=sayi/10;
        }
        else if(100<=sayi&&sayi<1000){

            top+=sayi%10;
            sayi-=top;
            top+=sayi/100;
            sayi=sayi/10;
            top+=sayi%10;

        }

        else{
            System.out.println("Lütfen 0 ile 1000 arası bir sayı giriniz!!!!!!");
        }

        System.out.println("Rakamlar toplamı="+top);

    }

}
