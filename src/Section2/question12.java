package Section2;

public class question12 {

    public static void main(String[] args) {
        /*
        (Print a table) Write a program that displays the following table. Cast floating point numbers into integers

        (Tablo oluşturma) Aşağıdaki tabloyu oluşturacak bir program yazınız: Gerçel sayıları tam sayıya dönüştürün.
         */
        soru12();
    }

    public static void soru12(){
        System.out.println("a   b   pow(a, b)");
        int b=2;
        for(int a=1;a<6;a++){
            System.out.println(a+"   "+b+"   "+(int)Math.pow(a, b));
            b++;
        }
    }

}
