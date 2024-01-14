package lec_14;


import java.util.Objects;


/**
 * java의 경우, data 관련 메서드를 추가하기에
 * 클래스가 장황해지거나, 클래스 생성 이후 추가적인 처리를 해줘야하는 단점이 있다.
 */
public class JavaPersonDto {

  private final String name;

  private final int age;

  public JavaPersonDto(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JavaPersonDto that = (JavaPersonDto) o;
    return age == that.age && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "JavaPersonDto{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
