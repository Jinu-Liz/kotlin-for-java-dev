package lec_13;

import lombok.Getter;

public class JavaHouse {

  private String address;

  @Getter
  private LivingRoom livingRoom;

  public JavaHouse(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  /**
   * 내부 클래스에 static을 사용하지 않는 경우, 상위 클래스인 JavaHouse에 대한 직접적인 참조가 이루어진다.
   * 그럴 경우에, 참조를 해지하지 못하는 경우 메모리 누수가 발생할 수 있고, 이를 디버깅하기 어렵다.
   * 또한 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한이 있다.
   * 따라서, 내부 클래스를 선언할 때 static을 붙여주는 것이 권장된다.
   */
  public static class LivingRoom {
    private double area;

    public LivingRoom(double area) {
      this.area = area;
    }
  }

}
