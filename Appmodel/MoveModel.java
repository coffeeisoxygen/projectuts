package Appmodel;

public class MoveModel {
    private MapboardModel mapboard;
    private PlayerModel player;
    private int playerRow;
    private int playerCol;

    public MoveModel(MapboardModel mapboard, PlayerModel player) {
        this.mapboard = mapboard;
        this.player = player;
        this.playerRow = 0; // Starting position (can be adjusted)
        this.playerCol = 0; // Starting position (can be adjusted)
    }

    public boolean movePlayer(String direction) {
        int newRow = playerRow;
        int newCol = playerCol;

        switch (direction.toLowerCase()) {
            case "up" -> newRow--;
            case "down" -> newRow++;
            case "left" -> newCol--;
            case "right" -> newCol++;
            case "n" -> {
                player.setEnergy(player.getEnergy() + 10);
                return true;
            }
            default -> {
                System.out.println("Invalid direction!");
                return false;
            }
        }

        if (isValidMove(newRow, newCol)) {
            playerRow = newRow;
            playerCol = newCol;
            player.addMovement(direction);
            return true;
        } else {
            System.out.println("Move out of bounds!");
            return false;
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < mapboard.getBoardrow() && col >= 0 && col < mapboard.getBoardcol();
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public int getPlayerCol() {
        return playerCol;
    }
}