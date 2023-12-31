package step4;

import java.util.Scanner;

//        문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
//        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        N = sc.nextInt();
        int[] arr = new int[N];                 // N은 5개를 받는다

        for(int i = 0; i < arr.length; i++){    // 5번 반복
            arr[i] = sc.nextInt();              // 20,10,35,30,7 정수 담아주고
        }
        // 최소값
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        // 최대값
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
