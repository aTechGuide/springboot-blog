package in.kamranali;

import java.util.Arrays;

/*
BlockChain has Transaction Information + Hash of previous block
 */
public class BlockChain {

  public static void main(String[] args) {

    //Transaction transaction1 = new Transaction("Kamran", "Palash", 100L);
    Transaction transaction1 = new Transaction("Kamran", "Palash", 1000L);
    Transaction transaction2 = new Transaction("Palash", "Prakhar", 110L);
    Transaction transaction3 = new Transaction("Prakhar", "Mayank", 120L);

    Block block1 = new Block(0, Arrays.asList(transaction1, transaction2));

  /*
  Here Block2 has hash of previous block.
   */

    Block block2 = new Block(block1.hashCode(), Arrays.asList(transaction3));

    // for Transaction transaction1 = new Transaction("Kamran", "Palash", 100L);
    System.out.println(block1.hashCode());  // 354690732
    System.out.println(block2.hashCode());  // 662422422

    // for Transaction transaction1 = new Transaction("Kamran", "Palash", 1000L);
    System.out.println(block1.hashCode());  // 354718632
    System.out.println(block2.hashCode());  // 663287322

    /*
    Every block is tightly coupled with each other.
    If we want to modify on block we need to go through entire chain.
     */

  }
}
