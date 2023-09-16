import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
//        20:3:5 입력시 오후8시03분05초로 출력하도록 scanf를 통한 입력 포맷을 만드는 방법을 확인 한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        String time = sc.next();
        String[] splitTime = time.split(":");
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);
        if(intHour > 12){
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
        } else if(intHour == 12) {
            System.out.printf("오후 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
        } else {
            System.out.printf("오전 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
        }
    }
}
