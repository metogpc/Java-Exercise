package Section1;

public class exam4 {
    public static void main(String[] args) {
        /*
        (Print a table) Write a program that displays the following table:
        (Tablo oluşturma) Aşağıdaki tabloyu oluşturacak bir program yazınız:
        */
        soru4();
    }

    public static void soru4(){

        for(int i=0;i<4;i++){

            System.out.println((i+1)+"  "+(int)(Math.pow(i+1, 2))+"  "+(int)(Math.pow(i+1, 3)));
        }
    }
}
