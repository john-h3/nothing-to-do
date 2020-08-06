package easy.array.xoroperationinanarray;
/**
 * XorOperationInAnArray
 * 
 * @author john 2020/8/7
 */
public class XorOperationInAnArray {
    class Solution {
        public int xorOperation(int n, int start) {
            int answer = start;
            for (int i = 1; i < n; i++) {
                answer ^= start + 2 * i;
            }
            return answer;
        }
    }
}