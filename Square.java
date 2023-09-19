import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 값을 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        // 정사각형 갯수
        for(int i = 1; i < n; i++){
            sum += (n-i)*(n-i);
        }
        // 45도 마름모 갯수
        for(int i = 1; i < n; i++){
            if(n-1 >= 2*i){
                sum += (n-2*i) * (n-2*i);
            }
        }
        // 45를 제외한 마름모 갯수
        for(int i = 1; i < n; i++){
            for(int j = 1+i; j < n; j++){
                if(n > i+j){
                    sum += 2*(((n)-(i+j)) * ((n)-(i+j)));
                }
            }
        }
        System.out.println(sum);
    }
}
