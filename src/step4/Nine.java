package step4;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;      // 바구니 총 N개
        int M;      // M번 바구니의 순서를 역순으로 만들려고 한다.

        N = sc.nextInt();
        M = sc.nextInt();
        int[] arr = new int[N + 1];             // index와 바구니 안의 숫자를 맞추기 위해서 +1 을 해줌 (1~n)

        for(int i = 1; i <= N; i++) {            // 배열 안에 숫자 넣기, i를 1을 해주는 이유는 1~5까지 들어갈 수 있게 하기 위함
            arr[i] = i;
        }
        for(int j = 0; j < M; j++){             // 4번의 순서를 역순으로 바꿈
            int num1 = sc.nextInt();            // num1 바구니부터
            int num2 = sc.nextInt();            // num2 바구니까지

            for(int k = num1; k <= num2; k++){
                int l = num2--;                 // 그 다음 조건문을 돌리지 않기 위해 쓰는건가..?
                int temp = arr[k];
                arr[k] = arr[l];
                arr[l] = temp;                  // 바꾸기 연산
            }
        }
        for(int i = 1; i <= N; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
