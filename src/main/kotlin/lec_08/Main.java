package lec_08;

public class Main {
  public static void main(String[] args) {

  }

  public int max(int a, int b) {
    if (a > b) return a;

    return b;
  }

  /**
   * java에서는 overloading을 사용하여 기본값을 셋팅한 후, 사용
   */
  public static void repeat(String str, int num, boolean useNewLine) {
    for (int i = 1; i <= num; i++) {
      if (useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }

  // overloading
  public void repeat(String str, int num) {
    repeat(str, num, true);
  }

  public void repeat(String str) {
    repeat(str, 3);
  }
}
