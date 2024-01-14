package lec_15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main15 {
  public static void main(String[] args) {
    int[] array = {100, 200};
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%s %s", i, array[i]);
    }

    final List<Integer> numbers = Arrays.asList(100, 200);

    // JDK 8까지
    Map<Integer, String> oldMap = new HashMap<>();
    oldMap.put(1, "MONDAY");
    oldMap.put(2, "TUESDAY");

    // JDK 9부터
    Map<Integer, String> newMap = Map.of(1, "MONDAY", 2, "TUESDAY");

    for (int key : newMap.keySet()) {
      System.out.println(key);
      System.out.println(newMap.get(key));
    }

    for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
