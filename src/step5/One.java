package step5;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num = sc.nextInt() - 1;         // charAt은 0부터 시작하기 때문에 -1을 해준다.
                                            // Ex> Backjoon 에서 k를 출력 할 것이라면 4를 해줘야 맞지만,
                                            // charAt() 은 0부터 시작이므로 4를 입력하면 5번 째에 위치한 j가 출력된다.
                                            // 그래서 sc.nextInt() - 1 을 한 것이다.
        // num값에 해당하는 문자 반환
        System.out.println(str.charAt(num));
    }
}
