package lec_02;

import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@AllArgsConstructor
public class Person {

  private String name;

//  @Nullable
  @NotNull
  public String getName() {
    return name;
  }
}
