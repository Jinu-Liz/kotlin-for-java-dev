package lec_06;

import java.util.Arrays;
import java.util.List;

public class main {
  public static void main(String[] args) {

    // 향상된 for문
    List<Long> numbers = Arrays.asList(1L, 2L, 3L);
    for (long number : numbers) {
      System.out.println(number);
    }

    // 전통적인 for문
    for (int i = 1; i <= 3; i++) {
      System.out.println(i);
    }

    // 1씩 내려가는 경우
    for (int i = 3; i >= 1; i--) {
      System.out.println(i);
    }

    // 2씩 올라가는 경우
    for (int i = 1; i <= 5; i += 2) {
      System.out.println(i);
    }
  }
}
