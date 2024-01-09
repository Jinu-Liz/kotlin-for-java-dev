package lec_09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JavaPerson {

  private final String name;

  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
