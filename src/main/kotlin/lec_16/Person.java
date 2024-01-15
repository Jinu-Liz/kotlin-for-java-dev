package lec_16;

import lombok.Getter;

@Getter
public class Person {

  private final String firstName;

  private final String lastName;

  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public int nextYearAge() {
    System.out.println("멤버 함수");
    return this.age + 1;
  }

}
