package Section3;

import java.util.Random;

public class question2 {

    /*
    (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, …,
    December for the number 1, 2, …, 12, accordingly.
    1 ile 12 arasında rastgele bir sayı üreten
    ve 1 - Ocak, 2 - Şubat ...12 - Aralık olacak şekilde bu sayıya karşılık gelen ayı gösteren bir program yazınız.*/


    public static void main(String[] args) {

        String ay;
        int a;
        int i=1;
        Random rd=new Random();
        while(true){

            a=rd.nextInt();

            switch(a){
                case 1:ay="Ocak";break;
                case 2:ay="Şubat";break;
                case 3:ay="Mart";break;
                case 4:ay="Nisan";break;
                case 5:ay="Mayıs";break;
                case 6:ay="Haziran";break;
                case 7:ay="Temmuz";break;
                case 8:ay="Ağustos";break;
                case 9:ay="Eylül";break;
                case 10:ay="Ekim";break;
                case 11:ay="Kasım";break;
                case 12:ay="Aralık";break;
                default:ay="lütfen 0 ile 12 arasında giriniz";
            }
            System.out.println(ay);
            i++;
        }
    }



}
