import java.util.Arrays;

public class StringRule {
    public static void main(String[] args) {
        //주어진 규칙에 따라 문자열을 생성하는 방법은 다음과 같습니다:
        //
        //초기 문자열을 "a"로 시작합니다.
        //주어진 문자열에서 'a'의 개수를 세고 이를 x로 저장합니다.
        //x를 사용하여 두 가지 행동 중 하나를 선택하여 문자열을 생성합니다.
        //3-1: 문자열의 양 옆에 각각 x개 만큼의 'b'를 추가합니다.
        //3-2: 문자열의 맨 앞 또는 맨 뒤에 'a'를 추가합니다.
        //위 과정을 주어진 문자열이 완성될 때까지 반복합니다.
        //완성된 문자열이 주어진 문자열과 동일한지 확인합니다.
        //["abab", "bbaa", "bababa", "bbbabababbbaa"]의 문자열 배열이 있을때
        // 위 규칙을 활용해서 만들어낼 수 있는지 참거짓값을 구할때 true, false, false, true 가 나왔다.
        String start = "a";
        String[] test = {"bab"};
        String str = "";
        String[] result = new String[test.length];

        for (int i = 0; i < test.length; i++) {
            str = test[i];

            while (str.length() > 1) {
                if (str.charAt(0) == 'a') {
                    str = str.substring(1);
                } else if (str.charAt(str.length() - 1) == 'a') {
                    str = str.substring(0, str.length() - 1);
                } else if (str.charAt(0) == 'b' && str.charAt(str.length() - 1) == 'b') {
                    str = str.substring(1, str.length() - 1);
                }
            }

            if (!str.equals("a")) {
                result[i] = "false";
            } else {
                result[i] = "true";
            }
        }
        System.out.println(Arrays.toString(result));
    }
}