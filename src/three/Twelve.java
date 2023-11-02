package three;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {		// EOF처리를 위해 Scanner의 메소드의 hasNext()로 처리
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
