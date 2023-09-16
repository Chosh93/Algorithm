import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        // 이름, 주소, 전화번호, 성별 입력 받아 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
        System.out.print("번호 : ");
        String phone = sc.nextLine();
        System.out.print("성별 : ");
        String gender = sc.nextLine();

        System.out.println("입력한 정보");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("번호 : " + phone);
        System.out.println("성별 : " + gender);
    }
}
