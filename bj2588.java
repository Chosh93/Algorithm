import java.util.Scanner;

public class bj2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a*(b%10);
        d = (a*((b%100)-(b%10)))/10;
        e = a*(b/100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c+(10*d)+(100*e));
    }
}
