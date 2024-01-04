package lec_03;

public class Main {
  public static void main(String[] args) {
    // java에서 string interpolation 예시
    Person person = new Person("지누리즈", 100);
    String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다.", person.getName(), person.getAge());

    StringBuilder builder = new StringBuilder();
    builder.append("사람의 이름은");
    builder.append(person.getName());
    builder.append("이고 나이는");
    builder.append(person.getAge());
    builder.append("세 입니다.");
  }
}
