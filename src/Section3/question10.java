package Section3;

import java.util.Random;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
                /*
        52 kartlık bir desteden kart çekmeyi simüle eden bir program yazınız. Programınız kartın değerini
        (As, 2, 3, 4, 5, 6, 7, 8, 9, 10, Vale, Kız, Papaz) ve hangi türden (Sinek, Karo, Kupa, Maça) olduğunu gösterecektir.
        Programın örnek akışını inceleyiniz:
        */
        while(true){
            System.out.println("Bir kart seçmek için 1 e basınız");
            Scanner scn=new Scanner(System.in);
            int a=scn.nextInt();
            int b,c;
            if(a==1){
                Random r=new Random();
                b=r.nextInt(4);
                c=r.nextInt(13);
                System.out.print("seçilen kart ");
                if(b==0)
                    System.out.print("Sinek ");
                else if(b==1)
                    System.out.print("Karo ");
                else if(b==2)
                    System.out.print("Kupa ");
                else
                    System.out.print("Maça ");

                if(c==1)
                    System.out.println("As'dır");
                else if(c==11)
                    System.out.println("Vale'dir");
                else if(c==12)
                    System.out.println("Kız'dır");
                else if(c==13)
                    System.out.println("Papaz'dır");
                else
                    System.out.println(c+"'dir");
            }
            else
                System.out.println("lütfen 1 e basınız kart seçmek için...");

        }
    }
}
