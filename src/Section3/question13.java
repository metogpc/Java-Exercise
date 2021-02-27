package Section3;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
               /*
        Dolar kaç türk lirasındayken alındığını ve kaç tl iken satıldığını ne kadar alındığını alan ve net kar zar durumunu
        gösteren program
        */
        while(true){
            Scanner scn=new Scanner(System.in);
            System.out.println("***Döviz alım-satım ve kar durumunu hesaplayan program");
            System.out.print("Alış Dolar kuru:");
            float alis=scn.nextFloat();
            System.out.print("Yatırılan Türk lirası:");
            float tl=scn.nextFloat();
            System.out.print("Satış DOlar kuru:");
            float satis=scn.nextFloat();
            float net=(tl/alis);
            net=net*satis;
            net=net-tl;
            if(net<0){
                System.out.print((-net)+" tl zarardasınız");
            }
            else
                System.out.print(net+" tl kardasınız");
        }
    }
}
