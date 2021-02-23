package Section1;

public class question11 {

    public static void main(String[] args) {
        /*
        (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
        (Nüfus tahmini) ABD Nüfus İdaresi, nüfus tahminlerini aşağıdaki varsayımlara dayanarak yapmaktadır:

        ■ One birth every 7 seconds
        ■ One death every 13 seconds
        ■ One new immigrant every 45 seconds

        ■ Her 7 saniyede bir doğum
        ■ Her 13 saniyede bir ölüm
        ■ Her 45 saniyede yeni bir göçmen gelmektedir

        Write a program to display the population for each of the next five years. Assume the current
        population is 312,032,486 and one year has 365 days.
        Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız.
        Şu an nüfusun 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.

         */
        soru11();
    }

    static void soru11(){

        long nufus=312032486;

        long ysn=60*60*24*365;
        double dogum=(double)ysn/7;
        double olum=ysn/13.0;
        double gocmen=ysn/45.0;

        int yillik=(int)(dogum-olum+gocmen);

        for(int i=1;i<=5;i++){
            nufus+=yillik;
            System.out.println(i+". yıl nüfus="+nufus);
        }
    }
}
