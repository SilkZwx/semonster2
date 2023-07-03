package semonster2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;

public class PlayerTest {
  @Test
  void appHasAGreeting() {
    LinkedList<Integer> numberList = new LinkedList<Integer>(Arrays.asList(1, 0, 0, 2, 4, 3, 0, 0, 4, 4));
    Player testPlayer = new Player(numberList, "sample");
    testPlayer.drawMonsters();
    assertEquals(testPlayer.toString(),
        "Deck:sample\nサハギン:レア度[0]\nスライム:レア度[2]\nシーサーペント:レア度[3]\nスライム:レア度[0]\nシーサーペント:レア度[4]\n");
  }
}
