package lec_12;

public class Main {
  public static void main(String[] args) {

    // companion 객체에 이름을 따로 붙이지 않은 경우, 'Companion'을 사용하면 된다.
    KotlinPerson2.Companion.newBaby("ABC");

    // 이름을 붙여준 경우, 이름으로 사용.
    KotlinPerson.Factory.newBaby("ABC");

    // companion 객체의 메서드에 @JvmStatic 어노테이션을 붙여주면 바로 사용이 가능하다.
    KotlinPerson2.newBaby("ABC");
  }
}
