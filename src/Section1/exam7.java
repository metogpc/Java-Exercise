package Section1;

public class exam7 {
    public static void main(String[] args) {
        /*
        p can be computed using the following formula:
        (Yaklaşık pi değerinin hesaplanması) Pi sayısı aşağıdaki formül kullanılarak hesaplanabilir:
         */

        soru7();
    }

    static void soru7(){
        int a=1;
        double sonuc;
        double yarim=0;
        double i=3;
        int c=0;

        while(c!=500000){
            if(a==1){
                yarim+=(-1/i);
                a++;
                i=i+2;
            }
            else{
                yarim+=1/i;
                a--;
                i=i+2;
            }
            c++;
        }

        sonuc=(double)4*(1+yarim);
        System.out.println(sonuc);
    }

}
