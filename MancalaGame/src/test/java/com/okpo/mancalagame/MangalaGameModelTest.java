import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MancalaGameModelTest {
    private MancalaGameModel game;

    @Before
    public void setUp() {
        game = new MancalaGameModel();
    }

    @Test
    public void testInitialStoneCounts() {
        int[] pits = game.getPits();
        int[] expectedCounts = new int[14]; // Initialize an array of 14 pits with 0 stones

        assertArrayEquals(expectedCounts, pits);
    }

    @Test
    public void testMakeMove() {
        game.makeMove(0); // Assuming that 0 is a valid pit to start the move
        int[] pits = game.getPits();

        // Implement assertions based on the game's logic and rules
        // For example, check if stones are distributed correctly
        // and whether the player gets an extra turn if the last stone lands in their big pit
    }

    /**
     *  1. Implement the test cases cover various scenarios, including boundary cases and edge cases,
     *  to ensure robust code. 
     * 
     *  2. Write tests for the other classes (e.g., MancalaGameController) 
     */
}
