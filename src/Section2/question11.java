package Section2;

import static Section2.question1.scn;

public class question11 {

    public static void main(String[] args) {

        soru11();
    }

    public static void soru11(){
        System.out.println("Lütfen pound değerini giriniz");
        double p=scn.nextDouble();
        double kg=p*0.454;
        System.out.println(p+" pound "+kg+" kg dir");
    }

}
