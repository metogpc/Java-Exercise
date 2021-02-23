package Section1;

public class question13 {

    public static void main(String[] args) {
        /*
        (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
        (Cebir:  2 x 2 doğrusal denklem sistemi çözümü) 2x2 doğrusal denklem sisteminin çözümü için Cramer kuralını kullanabilirsiniz.

        Write a program that solves the following equation and displays the value for x and y:
        Aşağıdaki denklemi çözüp x ve y’nin değerlerini gösteren bir program yazınız
        */

        soru13();
    }

    static void soru13(){
        double x;
        double y;
        System.out.println("3.4x + 50.2y=44.5");
        System.out.println("2.1x + 55y=5.9  ");

        x=(44.5*55-50.2*5.9)/(3.4*55-50.2*2.1);
        y=(44.5-(3.4*x))/50.2;

        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
