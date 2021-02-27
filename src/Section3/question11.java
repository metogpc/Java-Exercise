package Section3;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
              /*
        Kullanıcıdan bir tam sayı alan ve bu sayının 5 ve 6 ‘ya tam bölünen?(Doğru,Yanlıi),
        5 ya da 6 ’ya tam bölünen?(Doğru,Yanlış) ve 5 ya da 6 tam bölünen ama her ikini de aynı anda bölünmeyen?(Doğru,Yanlış)
        koşullarının sonuçlarını gösteren bir program yazınız.
        */
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int a=scn.nextInt();
        boolean k1=false;
        boolean k2=false;
        boolean k3=false;
        if(a%6==0&&a%5==0)
            k1=true;
        if(a%6==0||a%5==0)
            k2=true;
        if(k2)
            if(!k1)
                k3=true;

        System.out.println(a+" sayısı 5 ve 6 ya tam bölünür:"+k1);
        System.out.println(a+" sayısı 5 ya da 6 ya tam bölünür:"+k2);
        System.out.println(a+" sayısı 5 ya da 6 ya tam bölünen ama her ikisine de bölünemeyen:"+k3);
    }

}
