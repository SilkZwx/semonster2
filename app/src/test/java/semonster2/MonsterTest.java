package semonster2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    @Test void appHasAGreeting() {
        Monster classUnderTest = new Monster();
        assertNotNull(classUnderTest.toString(), "デュラハン:レア度[0]");
    }
}
