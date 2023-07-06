package semonster2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SeMonsterGameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testSeMonsterGame() {

        LinkedList<Integer> numberList = new LinkedList<Integer>(Arrays.asList(1, 0, 0, 2, 4, 3, 0, 0, 4, 4));
        SeMonsterGame mf = new SeMonsterGame(numberList);
        mf.addPlayer("user");
        mf.draw("user");
        assertEquals("Deck:user\nサハギン:レア度[0]\nスライム:レア度[2]\nシーサーペント:レア度[3]\nスライム:レア度[0]\nシーサーペント:レア度[4]\n"+System.lineSeparator(),outContent.toString());
    }
}
