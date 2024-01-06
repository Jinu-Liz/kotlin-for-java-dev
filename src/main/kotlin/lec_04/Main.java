package lec_04;

public class Main {
  public static void main(String[] args) {
    JavaMoney money =  new JavaMoney(1000L);
    JavaMoney money1 = new JavaMoney(2000L);
    JavaMoney money2 = new JavaMoney(1000L);
    JavaMoney money3 = money2;

    if (money1.compareTo(money2) > 0) System.out.println("Money1의 금액이 더 큽니다.");

    System.out.println(money == money2);   // 주소값이 다르니 false
    System.out.println(money2 == money3);   // 주소값이 같으니 true
    System.out.println(money.equals(money2));   // 필드값을 비교하기 때문에 true

    JavaMoney money4 = new JavaMoney(3000L);
    JavaMoney money5 = new JavaMoney(4000L);
    System.out.println(money4.plus(money5));  // JavaMoney(amount=5000)
  }
}
