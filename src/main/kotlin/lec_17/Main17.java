package lec_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main17 {
  public static void main(String[] args) {
    List<Fruit> fruits = Arrays.asList(
      new Fruit("사과", 1000),
      new Fruit("사과", 1200),
      new Fruit("사과", 1200),
      new Fruit("사과", 1500),
      new Fruit("바나나", 3000),
      new Fruit("바나나", 3200),
      new Fruit("바나나", 2500),
      new Fruit("수박", 10000)
    );

    // 익명클래스를 작성하여 변수로 넘긴다. 그러나 이 방법은 복잡하며, 다양한 filter가 필요할 수 있다.
    filterFruits(fruits, new FruitFilter() {
      @Override
      public boolean isSelected(Fruit fruit) {
        return Arrays.asList("사과", "바나나").contains(fruit.getName()) && fruit.getPrice() > 5000;
      }
    });

    // 람다는 깔끔하고 간결하게 사용 가능하다.
    filterFruits(fruits, fruit -> fruit.getName().equals("사과"));

    /**
     * java는 함수를 변수 및 파라미터로 취급할 수 없는 2급 시민이다.
     * 따라서 함수를 넘겨주고 있는 것처럼 보이지만 사실은 그렇지 않다.
      */
    filterFruitsWithLambda(fruits, Fruit::isApple);
  }

  // 사과만 찾고 싶을 때
  private List<Fruit> findApples(List<Fruit> fruits) {
    List<Fruit> apples = new ArrayList<>();
    for (Fruit fruit : fruits) {
      if (fruit.getName().equals("사과")) apples.add(fruit);
    }

    return apples;
  }

  // 바나나만 찾고 싶을 때
  private List<Fruit> findBananas(List<Fruit> fruits) {
    List<Fruit> bananas = new ArrayList<>();
    for (Fruit fruit : fruits) {
      if (fruit.getName().equals("바나나")) bananas.add(fruit);
    }

    return bananas;
  }

  // 위 두 개 메서드는 중복이 발생하므로 리팩터링
  private List<Fruit> findFruitsWithName(List<Fruit> fruits, String name) {
    List<Fruit> results = new ArrayList<>();
    for (Fruit fruit : fruits) {
      if (fruit.getName().equals(name)) results.add(fruit);
    }

    return results;
  }

  /**
   * 사과랑 바나나 같이 보여달라
   * 1200원 넘지 않는 사과만 보여달라 등등..
   * 조건이 늘어나면 늘어날수록 메서드도 늘어나게 된다.
   * 따라서 조건을 추상화하여 변수로 받아 사용한다.
   */
  private static List<Fruit> filterFruits(List<Fruit> fruits, FruitFilter fruitFilter) {
    List<Fruit> results = new ArrayList<>();
    for (Fruit fruit : fruits) {
      if (fruitFilter.isSelected(fruit)) results.add(fruit);
    }

    return results;
  }

  // 람다를 사용하여 변경
  private static List<Fruit> filterFruitsWithLambda(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {

    return fruits.stream()
      .filter(fruitFilter)
      .collect(Collectors.toList());
  }
}
