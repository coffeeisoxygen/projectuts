package Appmodel;

public class MapboardModel {
    public enum TileType {
        TILESAFE,
        TILEOBSTACLE,
        TILECHECKPOINT,
        TILESTARTPOINT,
        TILEENDPOINT
    }

    private TileType[][] mapboard;
    private int boardrow;
    private int boardcol;
    private static final int MAX_ROWS = 10; // Batas maksimum baris
    private static final int MAX_COLS = 20; // Batas maksimum kolom

    public MapboardModel(int rows, int cols) {
        if (rows > MAX_ROWS || cols > MAX_COLS) {
            throw new IllegalArgumentException("Rows and columns must be within the allowed limits.");
        }
        this.boardrow = rows;
        this.boardcol = cols;
        mapboard = new TileType[rows][cols];
        generateMapboard();
    }

    private void generateMapboard() {
        for (int i = 0; i < boardrow; i++) {
            for (int j = 0; j < boardcol; j++) {
                mapboard[i][j] = TileType.TILESAFE; // Default type
            }
        }
    }

    public int getBoardrow() {
        return boardrow;
    }

    public int getBoardcol() {
        return boardcol;
    }

    public TileType getMapboard(int x, int y) {
        return mapboard[x][y];
    }

    public void setMapboard(int x, int y, TileType value) {
        mapboard[x][y] = value;
    }

    public void printMapToTerminal() {
        for (int i = 0; i < boardrow; i++) {
            for (int j = 0; j < boardcol; j++) {
                System.out.print(mapboard[i][j] + " ");
            }
            System.out.println();
        }
    }

    // development code only
    public void printMapPosToTerminal() {
        for (int i = 0; i < boardrow; i++) {
            for (int j = 0; j < boardcol; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    public void printGetMapboardTerminal() {
        for (int i = 0; i < boardrow; i++) {
            for (int j = 0; j < boardcol; j++) {
                System.out.print("(" + i + "," + j + "):" + mapboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}