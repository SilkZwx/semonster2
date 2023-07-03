package semonster2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    @Test void appHasAGreeting() {
        Monster classUnderTest = new Monster(3, 0);
        assertEquals(classUnderTest.toString(), "デュラハン:レア度[0]\n");
    }

    @Test void testSummonsMonster() {
        Monster classUnderTest = new Monster(3, 0);
        assertEquals(classUnderTest.summonsMonster(0), "スライム");
        assertEquals(classUnderTest.summonsMonster(1), "サハギン");
        assertEquals(classUnderTest.summonsMonster(2), "ドラゴン");
        assertEquals(classUnderTest.summonsMonster(3), "デュラハン");
        assertEquals(classUnderTest.summonsMonster(4), "シーサーペント");
    }

}
