package lec_05;

public class Main {
  // java에서의 if-else
  private String getGrade(int score) {
    if (score >= 90) {

      return "A";
    } else if (score >= 80) {

      return "B";
    } else if (score >= 70) {

      return "C";
    } else {

      return "D";
    }
  }

  // java에서의 switch문
  private String getGradeWithSwitch(int score) {
    switch (score / 10) {
      case 9 :
        return "A";
      case 8 :
        return "B";
      case 7 :
        return "C";
      default:
        return "D";
    }
  }

  private void validate(int score) {
    if (0 <= score && score <= 100) {
      System.out.println();
    }
  }

  // java에서의 타입검사
  private boolean startsWithA(Object object) {
    if (object instanceof String) {
      return ((String) object).startsWith("A");
    } else {
      return false;
    }
  }

  // java에서의 여러 조건
  private void judgeNumber(int number) {
    if (number == 1 || number == 0 || number == -1) {
      System.out.println("어디에서 많이 본 숫자입니다.");
    } else {
      System.out.println("1, 0, -1이 아닙니다.");
    }
  }

  // java에서의 early return
  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다.");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다.");
      return;
    }

    System.out.println("주어진 숫자는 홀수입니다.");
  }
}
