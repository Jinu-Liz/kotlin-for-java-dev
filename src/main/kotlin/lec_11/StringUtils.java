package lec_11;

public abstract class StringUtils {

  private StringUtils() {}  // util 객체로 쓰기 위해 기본 생성자를 막아줌.

  public boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }
}
