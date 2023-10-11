package mangalagame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MancalaGameUI extends Application {
    private Stage primaryStage;

    MancalaGameModel model = new MancalaGameModel();
    MancalaGameController controller = new MancalaGameController(new MancalaGameModel());
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
     

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/layout/board.fxml"));
            Parent root = loader.load();

            // Create a responsive layout
            VBox root = new VBox();
            Scene scene = new Scene(root, 800, 600); // Specify an initial size

            // Add a label with accessibility information
            Label instructions = new Label("Welcome to the Mancala Game. Press Alt+M to move stones.");
            instructions.setAccessibleText("Instructions for the Mancala Game. Press Alt+M to move stones.");

            // Create the game board (modify this part according to your existing code)
            HBox gameBoard = createGameBoard();

            // Add components to the layout
            root.getChildren().addAll(instructions, gameBoard);
            // MancalaGameController 
            controller = loader.getController();
            controller.setUI(this);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Mancala Game");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implement methods to update the UI based on the game state
    // For example, update the stone counts in each pit and display game status
    public void updateUI() {
        // Implement UI updates here
    }

      private HBox createGameBoard() {
        // Implement your game board creation here
        // Ensure that the UI components are responsive and accessible
        // Use appropriate layout managers (e.g., HBox, VBox) and labels for accessibility
        // Add keyboard navigation support

        HBox gameBoard = new HBox();

        // Add game elements to gameBoard

        return gameBoard;
    }

    public static void main(String[] args) {
          // Initialize Firebase
        FirebaseInitializer.initialize();
        launch(args);
    }
}
