import Appcontroller.GameController;
import Appmodel.MapboardModel;
import Appmodel.PlayerModel;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for player name
            System.out.print("Enter player name: ");
            String playerName = scanner.nextLine();

            // Prompt user for energy
            System.out.print("Enter initial energy: ");
            int energy = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Prompt user for movement plan
            System.out.print("Enter movement plan (e.g., lrudn): ");
            String movementPlan = scanner.nextLine();

            // Create an instance of PlayerModel with specified player name and energy
            PlayerModel player = new PlayerModel(playerName, energy, movementPlan);

            // Prompt user for width and height
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            try {
                // Create an instance of MapboardModel with specified width and height
                MapboardModel mapboard = new MapboardModel(rows, cols);

                // Create an instance of GameController and start the game
                GameController gameController = new GameController(mapboard, player);
                gameController.startGame();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}