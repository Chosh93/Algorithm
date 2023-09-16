import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        // n개의 숫자를 입력 받아 최소값 및 최대값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력하세요 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
    }
}
