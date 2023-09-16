import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        // [1]서울 [2]경기 [3]인천 [4]수원으로 1,2,3,4 선택하여 문자열 출력
        String[] city = {"", "서울", "경기", "인천", "수원"};
        Scanner sc = new Scanner(System.in);
        System.out.print("도시를 선택 하세요. [1]서울, [2]경기, [3]인천, [4]수원 : ");
        int num = sc.nextInt();
        System.out.println(city[num]);
    }
}
