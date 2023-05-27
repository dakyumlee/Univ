package Univ;

import java.util.Scanner;

public class Univ {
    // 다중우주속의 나
    // Do while문 if문 이용
    // 1, 2, 3, 4 우주 존재
    // 1 우주= 거지새끼되기
    // 2 우주= 심즈되기
    // 3 우주= 거북목되기
    // 4 우주= 안정
    public static void main(String[] args) {
        final int OPTIONS = 3;
        int god, you = 0;
        int card = 0;
        int one = 0, two = 0, three = 0, four = 0;

        Scanner scan = new Scanner(System.in);
        String again = "네";

        System.out.println("god: 'HELLO USER'");
        do {
            god = (int) (Math.random() * 10) + 1;
            System.out.println("[당신은 univ에 떨어졌습니다. 여기서 탈출하기 위해서는 1부터 10까지의 카드 중 신과 같은 카드를 내야 합니다]");
            System.out.println("[같은 카드가 아닐 시 랜덤 우주로 배정되어 다양한 경험을 겪게 될 것입니다.]");
            System.out.print("god: 'choice card' >>>");
            int choice1;
            while (true) {
                try {
                    choice1 = scan.nextInt();
                    if (choice1 > 10) {
                        System.out.print("다시 입력해주세요 >>");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    scan.nextLine();
                }
            }
            scan.nextLine();

            you = (int) (Math.random() * 10) + 1;
            card = (int) (Math.random() * OPTIONS) + 1;

            if (god != you) {
                if (card == 1) {
                    System.out.println("[당신은 univ1에 떨어졌습니다. univ1의 당신은 거지새끼입니다.]");
                    System.out.println("[당신은 쫄쫄 굶다가 아사했습니다. 다시 한 번 game을 시작하시겠습니까?]");
                    one++;
                }
                if (card == 2) {
                    System.out.println("[당신은 univ2에 떨어졌습니다. univ2의 당신은 심즈입니다. 당신의 몸은 당신 것이 아닙니다.]");
                    System.out.println("[당신은 화재로 사망했습니다. 다시 한 번 game을 시작하시겠습니까?]");
                    two++;
                }
                if (card == 3) {
                    System.out.println("[당신은 univ3에 떨어졌습니다. univ3의 당신은 심각한 거북목입니다. 모두가 당신을 보고 바다로 돌아가라고 소리지릅니다.]");
                    System.out.println("[당신은 반복되는 고함으로 인해 스트레스 수치가 높아지고 고혈압이 심해져 사망했습니다. 다시 한 번 game을 시작하시겠습니까?]");
                    three++;
                }
            } else {
                System.out.println("[당신은 운이 좋군요! 당신이 떨어진 곳은 univ4입니다. 당신은 정상적인 인간의 형태를 가졌고, 화목한 가정을 이뤘으며 원만한 인간관계와 원하는 직업을 가졌습니다. 축하합니다.]");
                four++;
            }
            System.out.print("한판 더? (네/ 아니오): ");
            again = scan.nextLine();
        } while (again.equalsIgnoreCase("네"));
        
        System.out.println("[당신은 univ1에 " + one + "번, univ2에 " + two + "번, univ3에 " + three + "번, univ4에 " + four + "번 떨어졌습니다.]");
    }
}
