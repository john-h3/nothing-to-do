package easy.math.dayincong1daozuidadenweishulcof;

/**
 * DaYinCong1daoZuiDaDeNweiShuLcof
 *
 * @author john 2021/1/22
 */
public class DaYinCong1daoZuiDaDeNweiShuLcof {
  class Solution {
    public int[] printNumbers(int n) {
      int max = (int) (Math.pow(10, n) - 1);
      var result = new int[max];
      for (int i = 0; i < max; i++) {
        result[i] = i + 1;
      }
      return result;
    }
  }
}
