package Section3;

import static Section2.question1.scn;

public class question3 {

    public static void main(String[] args) {

        /*
        (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6).
        Also prompt the user to enter the number of days after today for a future day and display the future day of the week. Here is a sample run:
        Kullanıcıdan bugüne karşılık gelen bir tam sayı (Pazar - 0, Pazartesi - 1, …, ve Cumartesi - 6 olacak şekilde) alan bir
        program yazınız. Aynı zamanda kullanıcıdan, “bugünden kaç gün sonra” için de bir tam sayı değeri alarak,  ona karşılık gelen günü
        gösteriniz
        */
        String gunler="Pazartesi:1\n"
                + "Salı:2\n"
                + "Çarşamba:3\n"
                + "Perşembe:4\n"
                + "Cuma:5\n"
                + "Cumartesi:6\n"
                + "Pazar:7";
        System.out.println("Lütfen bir gün giriniz");
        System.out.println(gunler);
        int a=scn.nextInt();
        System.out.println("Kaç gun sonrayı göstermek istediğinizi giriniz");
        int b=scn.nextInt();
        int gun=(a+(b%7))%7;
        switch(gun){
            case 1:System.out.println("Pazartesi günü");break;
            case 2:System.out.println("Salı günü");break;
            case 3:System.out.println("Çarşamba günü");break;
            case 4:System.out.println("Perşembe günü");break;
            case 5:System.out.println("Cuma günü");break;
            case 6:System.out.println("Cumartesi günü");break;
            case 7:System.out.println("Pazar günü");break;
        }
    }
}
