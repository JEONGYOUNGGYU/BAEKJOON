package step3;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        num = sc.nextInt();
        for (int x = 1; x <= num; x++){
            for(int y = 1; y <= num - x ; y++){
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
