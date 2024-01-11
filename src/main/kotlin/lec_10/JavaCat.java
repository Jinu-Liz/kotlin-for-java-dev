package lec_10;

public class JavaCat extends JavaAnimal {

  public JavaCat(String species) {
    super(species, 4);
  }

  @Override
  public void move() {
    System.out.println("고양이가 사뿐사뿐 걸어감");
  }
}
