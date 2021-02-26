package Section3;

import static Section2.question1.scn;

public class question5 {
    public static void main(String[] args) {
        //bir sayının polindrom olup olmadığını kontrol eden program
        System.out.println("Bir sayı giriniz");
        int a=scn.nextInt();
        int b=1;
        boolean c=true;
        int i=3;
        if(a<100)
            System.out.println("Sayı 100 den küçük boyu sayı kontrol edilemez");
        else{
            while(c==true){//a nın basamak sayısını bulduğumuz kısım
                if(a<Math.pow(10, i)){
                    b=i;
                    c=false;
                }
                else
                    i++;
            }
            int[] basamaklar=new int[b];
            /* Basamaklarımızı doğru buldumuzun kontrolü
            for(int k:basamaklar)
                System.out.print(k+" ");
                */

            if(polindrom(basamaklariAktar(basamaklar,a,b)))
                System.out.println(a+"Sayımız polindromdur");
            else
                System.out.println(a+"Sayımız polindrom değildir");

        }

    }
    private static boolean polindrom(int[] basamaklar){
        boolean q=true;

        for(int m=0;m<(basamaklar.length/2);m++){
            if(basamaklar[m]!=basamaklar[(basamaklar.length-1)-m])
                q=false;
        }

        return q;
    }

    private static int[] basamaklariAktar(int[] basamaklar , int a, int b){
        for(int j=0;j<b;j++){//basamakları bir diziye aktardığımız kısım
            basamaklar[j]=a%10;
            a=a/10;
        }
        return basamaklar;
    }
}
