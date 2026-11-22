import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Expedition expedition = new Expedition();
        boolean running = true;

        System.out.println("=== RELIC EXPEDITION ===");
        System.out.println("Objective: Collect all relics (R) and reach the exit (X) before your energy runs out.");

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. New Game");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    expedition = new Expedition();
                    System.out.println("Starting new expedition... (Map generation will be implemented in Stage 2)");
                    System.out.println("Initial Status: " + expedition.getStatus()
                            + " | Energy: " + expedition.getEnergy()
                            + " | Relics: " + expedition.getCollectedRelics() + "/" + expedition.getRequiredRelics()
                            + " | Moves: " + expedition.getMoves());
                    break;
                case "2":
                    System.out.println("Exiting Relic Expedition. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    break;
            }
        }

        scanner.close();
    }
}