package Section3;

import java.util.Random;

public class question7 {
    public static void main(String[] args) {
        /*
        Bir dikdörtgen içinde kalacak şekilde rastgele nokta üreten bir program yazınız.
        Bu dikdörtgenin merkezi (0, 0) noktası, uzunluğu 100 ve yüksekliği 200 olsun.
        */
        Random r=new Random();
        Random r2=new Random();
        int a;
        a=1+r.nextInt(50);
        System.out.println(a);
        for(int i=0;i<200;i++){
            for(int j=0;j<100;j++){

                if(j==0)
                    System.out.print("|");
                else if(j==99)
                    System.out.print("|");
                else if(r.nextInt()%a==0){
                    System.out.print(".");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
