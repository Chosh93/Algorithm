import java.util.Scanner;

public class targetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 수의 개수를 입력하세요. : ");
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("정수 입력 : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("타겟 넘버를 입력하세요 : ");
        int target = sc.nextInt();
        Solution solution = new Solution();
        int result = solution.solution(numbers,target);
        System.out.println(result);
    }
    static class Solution{
        int answer = 0;

        public int solution(int[] numbers, int target) {
            dfs(numbers, 0, target, 0);
            return answer;
        }

        public void dfs(int[] numbers, int depth, int target, int sum){
            if(depth == numbers.length){
                if(target == sum) answer++;
            } else{
                dfs(numbers, depth + 1, target, sum + numbers[depth]);
                dfs(numbers, depth + 1, target, sum - numbers[depth]);
            }
        }
    }
}
