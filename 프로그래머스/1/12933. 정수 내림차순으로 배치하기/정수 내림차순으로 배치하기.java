import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);      // long n을 String str에 저장하기 위한 형변환
        
        String[] arr = str.split("");       
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        str = String.join("", arr);
        
        answer = Long.parseLong(str);       // return 값을 Long에 맞춰 형변환
        
        return answer;
    }
}