package step4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//문제
//        9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//        예를 들어, 서로 다른 9개의 자연수
//
//        3, 29, 38, 12, 57, 74, 40, 85, 61
//
//        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
//
//        입력
//        첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//
//        출력
//        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

//    예제 입력 1
//        3
//        29
//        38
//        12
//        57
//        74
//        40
//        85
//        61
//        예제 출력 1
//        85
//        8
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int num;
        for(int i = 0; i < 9; i++){
            num = sc.nextInt();                      // 9가지 수 입력
            list.add(num);
        }
        for(int i = 0; i < 9; i++){
            if(max < list.get(i)){
                max = list.get(i);                   // 최대값 구하기
            }
        }
        System.out.println(max);
        for(int i = 0; i < 9; i++){
            if(list.equals(max)){                    // 배열 안의 수 중 최대값이랑 같으면
            }
        }
        System.out.println(list.indexOf(max) + 1);   // 몇 번째인지 출력
    }
}




