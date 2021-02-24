package Section2;

import static Section2.question1.scn;

public class question10 {

    public static void main(String[] args) {
        /*
        (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance
        between them.

        (Geometri: iki nokta arasındaki mesafe) Kullanıcıdan (x1, y1) ve (x2, y2) gibi iki nokta girmesini isteyen ve bu iki nokta arasındaki mesafeyi
        gösteren bir program yazınız.

        The formula for computing the distance is. Note that you can use Math.pow(a, 0.5) to compute .
        Mesafeyi hesaplamak için kullanabileceğiniz formül .   ‘yı hesaplamak için  Math.pow(a, 0.5) metodunu kullanabilirsiniz.
         */
        soru10();
    }

    public static void soru10(){

        System.out.println("(x1,y1) degerlerini giriniz:");
        double x1=scn.nextDouble();
        double y1=scn.nextDouble();
        System.out.println("(x2,y2) değerlerini giriniz");
        int x2=scn.nextInt();
        int y2=scn.nextInt();
        double x,y;
        x=x2-x1;
        y=y2-y1;
        double a=Math.pow(x,2)+Math.pow(y, 2);
        double l=Math.pow(a,0.5);

        System.out.println("Uzaklık:"+l);
    }
}
