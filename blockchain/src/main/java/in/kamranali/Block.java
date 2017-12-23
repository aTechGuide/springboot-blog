package in.kamranali;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Block {

  private int previousHash;
  private List<Transaction> transactionList;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Block block = (Block) o;

    if (previousHash != block.previousHash) {
      return false;
    }
    return transactionList.equals(block.transactionList);
  }

  @Override
  public int hashCode() {
    int result = previousHash;
    result = 31 * result + transactionList.hashCode();
    return result;
  }
}
