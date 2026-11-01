public class Game {
    private int releaseYear;
    private double rating;
    private String os;
    private String name;

    public Game() {
        this.name = "Неизвестная игра";
        this.releaseYear = 2020;
        this.rating = 5.0;
        this.os = "Windows";
    }
    public Game(int realisYear, double rating){
        this.releaseYear = 2021;
        this.rating = 4.6;
    }
    public Game(String name, int releaseYear, double rating, String os){
        this.os = "mac";
        this.rating = 4.2;
        this.releaseYear = 2020;
        this.name = "Игра";
    }


    public String getName(){
        return name;
    }
    public  String getGameType(){
        return "Игра";
    }

    public int getRealisYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public String getOs() {
        return os;
    }

    public void displayInfo(){
        System.out.println("Название игры "+name);
        System.out.println("Жанр "+getGameType());
        System.out.println("Год выпуска  "+releaseYear);
        System.out.println("Оценка игры = "+rating);
        System.out.println("Операционная система "+os);
    }
}
