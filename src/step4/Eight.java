package step4;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        boolean check = false;      // 같은 값이 있다면 check를 true 만들어 카운트 하지 않음
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() % 42;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    check = true;
                    break;
                }else{
                    check = false;
                }
            }
            if(check == false){
                count++;
            }
        }
            System.out.println(count);
    }
}
