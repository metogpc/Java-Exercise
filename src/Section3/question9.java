package Section3;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {

        /*
         Kullanıcıdan kenar uzunluklarını alan ve eğer kenar uzunlukları geçerli ise üçgenin çevresini hesaplayıp gösteren bir program
         yazınız. Kenar uzunlukları geçerli değilse, “Geçersiz uzunluk değeri” mesajını gösteriniz. Her iki kenarın uzunluğunun
        toplamı, diğer kenardan büyükse kenar uzunlukları geçerlidir.
        */
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını sırayla giriniz");
        System.out.print("1:");int a=scn.nextInt();
        System.out.print("2:");int b=scn.nextInt();
        System.out.print("3:");int c=scn.nextInt();
        boolean k=false;
        if(a+b>c){
            if(b+c>a)
                if(a+c>b)
                    k=true;
        }

        if(k==true)
            System.out.println("Uzunluklar Geçerlidir");
        else
            System.out.println("Geçersiz uzunluk değeri");
    }
}
