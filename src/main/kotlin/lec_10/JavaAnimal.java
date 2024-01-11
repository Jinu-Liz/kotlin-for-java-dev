package lec_10;

import lombok.Data;

@Data
public abstract class JavaAnimal {

  protected final String species;

  protected final int legCount;

  abstract public void move();

}
