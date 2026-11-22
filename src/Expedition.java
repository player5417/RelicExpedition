public class Expedition {
    private char[][] map;
    private int row;
    private int column;
    private int energy;
    private int maxEnergy;
    private int collectedRelics;
    private int requiredRelics;
    private int moves;
    private String status;

    public Expedition() {
        this.map = new char[0][0];
        this.row = -1;
        this.column = -1;
        this.energy = 0;
        this.maxEnergy = 0;
        this.collectedRelics = 0;
        this.requiredRelics = 0;
        this.moves = 0;
        this.status = "NOT_STARTED";
    }

    public boolean startNewGame(int rows, int cols) {
        return false;
    }

    public char[][] getMap() {
        return new char[0][0];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCollectedRelics() {
        return collectedRelics;
    }

    public int getRequiredRelics() {
        return requiredRelics;
    }

    public int getMoves() {
        return moves;
    }

    public String getStatus() {
        return status;
    }

    public int getScore() {
        return (100 * collectedRelics) + (5 * energy);
    }

    public String move(String direction) {
        if (!"ACTIVE".equals(status)) {
            return "NOT_ACTIVE";
        }
        return "INVALID_COMMAND";
    }

    public String execute(String command) {
        return "INVALID_COMMAND";
    }

    public String renderMap() {
        return "";
    }
}