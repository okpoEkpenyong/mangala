package mangalagame;

public class MancalaGameModel {
    private int[] pits;
    private int currentPlayer;
    private boolean gameActive;
    private GameBoard gameBoard;
  

    public MancalaGameModel() {
        initializeGame();
    }

    public void initializeGame() {
        pits = new int[14];
        for (int i = 0; i < 14; i++) {
            pits[i] = 6; // Initialize each pit with 6 stones
        }
        currentPlayer = 0; // Player 1 starts
        gameActive = true;
    }

    public boolean makeMove(int pitIndex) {
         // Securely handle the move

        // Ensure user authorization to make the move
        
        // Implement data validation to prevent cheating

        // Handle Exceptions

         if (!gameActive) {
            throw new IllegalStateException("The game is not active.");
        }
        
        if (pitIndex < 0 || pitIndex >= 14) {
            throw new IllegalArgumentException("Invalid pit index.");
        }

        if (pits[pitIndex].getStones() == 0 || pitIndex == 6 || pitIndex == 13) {
            throw new IllegalArgumentException("Invalid move: Selected pit is empty or a big pit.");
        }

        if (!gameActive) {
            // Game is not active
            return false;
        }

        if (pitIndex < 0 || pitIndex >= 14) {
            // Invalid pit index
            return false;
        }

        if (pits[pitIndex] == 0 || pitIndex == 6 || pitIndex == 13) {
            // Empty pit or big pit
            return false;
        }

        int stones = pits[pitIndex];
        pits[pitIndex] = 0;
        int currentIndex = pitIndex;

        while (stones > 0) {
            currentIndex = (currentIndex + 1) % 14;
            if ((currentPlayer == 0 && currentIndex == 13) || (currentPlayer == 1 && currentIndex == 6)) {
                continue; // Skip opponent's big pit
            }
            pits[currentIndex]++;
            stones--;
        }

        // Capture rules are handled here

        // Check if the game has ended
        if (isGameEnd()) {
            gameActive = false;
        } else {
            switchPlayer();
        }

        return true;
    }

    public int[] getPits() {
        return pits;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameActive() {
        return gameActive;
    }

    public boolean isGameEnd() {
        // Implement game end conditions here
        // ...
        return false;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer + 1) % 2;
    }
}
