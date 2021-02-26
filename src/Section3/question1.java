package Section3;

import static Section2.question1.scn;

public class question1 {
        /*
	    b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
	    If it is zero, the equation has one root. If it is negative, the equation has no real roots.  Write a program that prompts
	    the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive,
	    display two roots.
	    If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”

	    b2 - 4ac ifadesine denklemin diskriminantı denir. Bu değer pozitifse, denklemin iki gerçek kökü vardır.
        Bu değer sıfırsa, denklemin bir kökü vardır. Bu değer negatifse, denklemin hiç gerçek kökü yoktur.
        Kullanıcıdan a, b, c değerlerini alan ve diskriminantı hesaplayıp, denklemin sonucunu gösteren bir program yazınız.
        Eğer diskriminant pozitfse iki kökü gösteriniz.
        Eğer diskriminant 0 ise bir kökü gösteriniz.
        Aksi takdirde “Denklemin hiçbir gerçek kökü yoktur” mesajını gösteriniz.*/

    public static void main(String[] args) {
        System.out.println("a,b ve c değerlerini sırayla giriniz");
        System.out.print("a:");
        int a=scn.nextInt();
        System.out.print("b:");
        int b=scn.nextInt();
        System.out.print("c:");
        int c=scn.nextInt();
        double d=diskriminant(a, b, c);

        if(d>0){
            System.out.println("r1:"+((-b+Math.pow(d, 0.5))/2*a));
            System.out.println("r1:"+((-b-Math.pow(d, 0.5))/2*a));
        }
        else if(0<d){
            System.out.println("Bu denklemin hiçbir ökü yoktur");
        }
        else{
            System.out.println("r1:"+((-b+Math.pow(d, 0.5))/2*a));
        }
    }

    private static double diskriminant(int a,int b, int c){
        return b*b-4*a*c;
    }
}
