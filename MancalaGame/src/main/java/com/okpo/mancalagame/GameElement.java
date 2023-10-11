package mangalagame;

public abstract class GameElement {
    protected int stones;
    
    public int getStones() {
        return stones;
    }
    
    public void addStones(int count) {
        stones += count;
    }
    
    public int empty() {
        int count = stones;
        stones = 0;
        return count;
    }
}

public class Pit extends GameElement {
    public Pit(int initialStones) {
        this.stones = initialStones;
    }
    
    // Additional methods and properties specific to pits
}

public class BigPit extends GameElement {
    public BigPit() {
        this.stones = 0;
    }
    
    // Additional methods and properties specific to big pits
}

public class Player {
    private int id;
    private List<Pit> pits;
    private BigPit bigPit;
    
    public Player(int id) {
        this.id = id;
        this.pits = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            pits.add(new Pit(6)); // Initialize each pit with 6 stones
        }
        this.bigPit = new BigPit();
    }
    
    // Additional methods and properties specific to players
}

public class GameBoard {
    private Player[] players;
    
    public GameBoard() {
        players = new Player[] {new Player(0), new Player(1)};
    }
    
    // Additional methods and properties specific to the game board
}
