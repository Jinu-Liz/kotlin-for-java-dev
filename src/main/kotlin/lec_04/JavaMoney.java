package lec_04;

import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
public class JavaMoney implements Comparable<JavaMoney> {

  private final long amount;

  @Override
  public int compareTo(@NotNull JavaMoney o) {
    return Long.compare(this.amount, o.amount);
  }
}
