public class Quest extends Game {
    private int ageRating;
    public Quest(){
        super();
        this.ageRating = 12;
    }
    public Quest(int releaseYear, double rating, int ageRating){
        super(releaseYear,rating);
        this.ageRating = ageRating;
    }
    public Quest(String name, int releaseYear, double rating, String os,
                 int ageRating){
        super(name, releaseYear, rating, os);
        this.ageRating = ageRating;
    }

    public int getAgeRating() {
        return ageRating;
    }

    @Override
    public String getGameType() {
        return "Квест";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Возрастное ограничение игры: "+ageRating);
    }
}