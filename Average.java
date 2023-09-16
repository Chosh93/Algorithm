import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // 첫번째 열에 입력 받을 숫자의 개수
        // 두번째 열에 공백 기준으로 첫번째 열에서 주어진 개수 만큼 성적 입력 (단 성적은 정수)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < num; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }
        double avg = (double) sum / num;
        System.out.printf("입력한 성정의 평균은 : %.2f", avg);
    }
}
