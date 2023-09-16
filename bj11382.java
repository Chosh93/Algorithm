import java.util.Scanner;

public class bj11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int sum = 0;
        a = sc.nextLine();
        String[] test = a.split(" ");
        for(int i = 0; i < test.length; i++){
            sum += Integer.parseInt(test[i]);
        }
        System.out.println(sum);
    }
}
