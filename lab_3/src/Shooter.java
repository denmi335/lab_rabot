public class Shooter extends Game{
    private int levelCount;
    private String weaponType;

    public Shooter(){
        super();
        this.levelCount = 12;
        this.weaponType = "rifle";
    }
    public Shooter(int releaseYear, double rating, int levelCount){
        super(releaseYear,rating);
        this.levelCount = levelCount;
        this.weaponType = "pistol";
    }
    public Shooter(String name, int releaseYear, double rating, String os,
                   int levelCount, String weaponType){
        super(name, releaseYear, rating, os);
        this.weaponType = weaponType;
        this.levelCount = levelCount;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getGameType() {
        return "Шутер";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество уровней: "+levelCount);
        System.out.println("Ваш тип оружия: "+weaponType);
    }
}
