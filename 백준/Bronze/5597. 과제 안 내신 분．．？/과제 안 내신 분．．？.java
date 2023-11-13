import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];                // index는 0부터 시작이니깐 30까지 채워줄려면 31로 해야함
        int N;                                  // 입력받는값 설정

        for(int i = 0; i < 28; i++){            // 28번 입력을 받아야한다.
            N = sc.nextInt();                   // 28번 돌아가면서 수 입력받고
            arr[N] = 1;                         // arr[과제제출한사람번호] == 1로 바꿈
        }
        for(int i = 1; i < arr.length; i++){    // 학생 수 30번까지 반복해서 (i를 0으로 한다면 0번이 생겨서 값이 안맞음)
            if(arr[i] != 1){                    // arr[과제제출한사람번호]가 1이 아니면
                System.out.println(i);          // 과제제출한사람이 아니므로 그 번호를 반환해라
            }
        }
    }
}