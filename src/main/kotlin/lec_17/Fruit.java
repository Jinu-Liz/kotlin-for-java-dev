package lec_17;

import lombok.Getter;

@Getter
public record Fruit(String name, int price) {

  public static boolean isApple(Fruit fruit) {
    return fruit.getName().equals("사과");
  }
}
