import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num = sc.nextInt() - 1;

        // num값에 해당하는 문자열을 반환하기
        System.out.println(str.charAt(num));
    }
}