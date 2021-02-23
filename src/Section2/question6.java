package Section2;

import static Section2.question1.scn;

public class question6 {
    /*
    (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the
    minutes. For simplicity, assume a year has 365 days.
    (Kaç yıl) Kullanıcıdan dakika olarak giriş yapılmasını isteyen (ör. 1 000 000) ve buna karşılık gelen yıl,
    gün ve dakikayı gösteren bir program yazınız. Her zaman bir yılın 365 gün olduğunu varsayın.
    */
    public static void main(String[] args) {
        soru6();
    }

    public static void soru6(){
        System.out.println("Dakikayı giriniz");
        long dk=scn.nextLong();
        long yil=dk/525600;
        long dk1=dk-(yil*525600);
        long gun=dk1/1440;

        System.out.println(dk+"="+yil+" yıl "+(int)gun+" gun dur");

    }

}
