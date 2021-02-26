package Section3;

import static Section2.question1.scn;

public class question4 {

    public static void main(String[] args) {
        //(Sort three integers) Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
        //Kullanıcıdan 3 sayı alan ve bunları büyükten küçüğe sıralayan program
        System.out.println("Kaç adet değeri karşılaştıracağımızı giriniz");
        int s=scn.nextInt();
        int[] dizi=new int[s];
        degerAl(dizi);
        sirala(dizi);
        yazdir(dizi);

    }

    private static void yazdir(int[] dizi){

        System.out.print("Değerler sırayla->");
        for(int d:dizi)
            System.out.print(d+"  ");
        System.out.println("");
    }
    private static int[] degerAl(int[] dizi){

        System.out.println("Değerleri sırayla giriniz");
        for(int i=0;i<dizi.length;i++){
            System.out.print((i+1)+":");
            dizi[i]=scn.nextInt();
        }
        System.out.println("************************");
        return dizi;
    }
    private static int[] sirala(int[] dizi){
        int a;
        for(int j=0;j<dizi.length;j++){
            for(int i=0;i<dizi.length;i++){
                if(i==dizi.length-1)
                    break;
                if(dizi[i+1]<dizi[i]){
                    a=dizi[i+1];
                    dizi[i+1]=dizi[i];
                    dizi[i]=a;
                }
            }
        }
        return dizi;
    }
}
