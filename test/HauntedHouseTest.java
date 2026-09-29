import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HauntedHouseTest {

    HauntedHouse house;

    @BeforeEach
    void setUp() {
        house = new HauntedHouse();
    }

    @Test
    void isGhostPresent() {
        boolean presence = house.isGhostPresent();
        assertTrue(presence);
    }

    @Test
    void scareAwayGhostTest() {
        boolean presence = house.isGhostPresent();
        assertTrue(presence);
        house.scareAwayGhost();
        presence = house.isGhostPresent();
        assertFalse(presence);
    }

    @Test
    void refillCandyBowlPos() {
        assertEquals(10, house.getCandyCount());
        house.refillCandyBowl(5);
        assertEquals(15, house.getCandyCount());
    }

    @Test
    void refillCandyBowlNeg() {
        assertEquals(10, house.getCandyCount());
        house.refillCandyBowl(-10);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void spookySound() {
        assertEquals("Boo!", house.spookySound());
    }

    @Test
    void trickOrTreat() {
        assertEquals(10, house.getCandyCount());
        house.trickOrTreat(4);
        assertEquals(6, house.getCandyCount());
    }

    @Test
    void trickOrTreatTooManyPeople() {
        assertEquals(10, house.getCandyCount());
        house.trickOrTreat(15);
        assertEquals(0, house.getCandyCount());
    }

    @Test
    void runningLow() {
        house.trickOrTreat(60);
        assertEquals(0, house.getCandyCount());
        house.runningLow();
        assertEquals(10, house.getCandyCount());

    }

    @Test
    void haunting(){
        boolean presence = house.isGhostPresent();
        house.scareAwayGhost();
        presence = house.isGhostPresent();
        assertFalse(presence);
        house.haunting();
        assertTrue(house.isGhostPresent());
    }
}