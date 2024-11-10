package Appcontroller;

import Appmodel.MapboardModel;
import Appmodel.MoveModel;
import Appmodel.PlayerModel;
import java.util.Scanner;

public class GameController {
    private MapboardModel mapboard;
    private PlayerModel player;
    private MoveModel moveModel;

    public GameController(MapboardModel mapboard, PlayerModel player) {
        this.mapboard = mapboard;
        this.player = player;
        this.moveModel = new MoveModel(mapboard, player);
    }

    public void startGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean gameRunning = true;

            while (gameRunning) {
                if (player.getMovementList().isEmpty()) {
                    System.out.println("No more movements left. Game over!");
                    gameRunning = false;
                    continue;
                }

                String move = player.getMovementList().remove(0);
                System.out.println("Next move: " + move);

                if (move.equalsIgnoreCase("quit")) {
                    gameRunning = false;
                } else {
                    if (moveModel.movePlayer(move)) {
                        System.out.println(
                                "Player moved to (" + moveModel.getPlayerRow() + ", " + moveModel.getPlayerCol() + ")");
                    }
                }

                // Print player status
                player.printPlayerStatus();
            }
        }
    }
}