package Section1;

public class exam6 {
    public static void main(String[] args) {

        /*
        Write a program that displays the result of  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
        (Seri toplamı) Aşağıdaki ifadenin sonucunu gösteren bir program yazınız.
         */

        soru6();
    }


    static void soru6(){
        int toplam=0;
        int i=1;
        while(i!=10){
            if(i==9)
                System.out.print(i+"=");
            else
                System.out.print(i+"+");
            toplam+=i;
            i++;
        }

        System.out.println(toplam);
    }
}
