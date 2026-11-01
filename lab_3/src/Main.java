public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Strategy strategy1 = new Strategy();
        Shooter shooter1 = new Shooter();
        Quest quest1 = new Quest();

        Strategy strategy2 = new Strategy("Civilization", 2020, 9.5, "Windows", 1000, 20, true);
        Shooter shooter2 = new Shooter("Call of Duty", 2021, 8.7, "Windows", 15, "rifle");
        Quest quest2 = new Quest("The Witcher 3", 2015, 9.8, "Windows", 18);

        strategy2.displayInfo();
        System.out.println();
        shooter2.displayInfo();
        System.out.println();
        quest2.displayInfo();

        Game[] games = {strategy1, shooter1, quest1};
        System.out.println("\n=== Полиморфизм ===");
        for (Game game : games) {
            System.out.println("Тип: " + game.getGameType());
            game.displayInfo();
            System.out.println();
        }
    }
}