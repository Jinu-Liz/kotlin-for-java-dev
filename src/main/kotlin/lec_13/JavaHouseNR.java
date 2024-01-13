package lec_13;

import lombok.Getter;

public class JavaHouseNR {

  private String address;

  @Getter
  private LivingRoom livingRoom;

  public JavaHouseNR(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  /**
   * 권장되지 않는 내부 클래스
   */
  public class LivingRoom {
    private double area;

    public LivingRoom(double area) {
      this.area = area;
    }

    // 바깥 클래스 참조
    public String getAddress() {
      return JavaHouseNR.this.address;
    }
  }

}
