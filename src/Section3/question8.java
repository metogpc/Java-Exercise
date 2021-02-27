package Section3;

import java.util.Random;
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
         /*
        Makas, taş, kağıt oyununu oynatan bir program yazınız. (Makas kağıdı keser, taş makası kırar, ve kağıt taşı sarar.)
        Program rastgele makas, taş ve kağıdı temsilen 0, 1, 2  sayılarını üretsin.Program kullanıcıdan 0, 1, 2 sayılarından
        birini girmesini istesin ve bilgisayarın sonucuna göre “kazandınız”, “kaybettiniz” ya da “berabere kaldınız” mesajlarından
        uygun olanı göstersin.
        */
        Scanner scn=new Scanner(System.in);
        Random r=new Random();
        int a,b;
        while(true){
            System.out.println("*****Taş Kağıt Makas oyununa HOŞGELDİNİZİ..*****");
            System.out.println("Taş:1 , Kağıt:2 , Makas:3  tuşlarına basınız");
            a=scn.nextInt();
            b=1+r.nextInt(3);
            if(3<a)
                System.out.println("Lütfen 1 ile 3 arasında değerler giriniz");
            else if(a<1)
                System.out.println("Lütfen 1 ile 3 arasında değerler giriniz");
            else if(a==b){
                if(a==1)
                    System.out.println("Sen:taş Pc:Taş BERABERE..");
                if(a==2)
                    System.out.println("Sen:Kağıt Pc:Kağıt BERABERE..");
                if(a==3)
                    System.out.println("Sen:Makas Pc:Makas BERABERE..");
            }
            else if(a-b==1||a-b==-1){
                if(a==1||b==1){
                    if(a>b)
                        System.out.println("Sen:kağıt Pc:Taş Kazandın...");
                    else
                        System.out.println("Sen:Taş Pc:Kağıt Kaybettin...");
                }
                if(a==3||b==3){
                    if(a>b)
                        System.out.println("Sen:Makas Pc:Kağıt Kazandın...");
                    else
                        System.out.println("Sen:Kağıt Pc:Makas Kaybettin...");
                }
            }
            else{
                if(a>b)
                    System.out.println("Sen:Makas Pc:Taş Kaybettin....");
                else
                    System.out.println("Sen:Taş Pc:Makas Kazandın....");
            }

            System.out.println(b);
        }
    }
}
