public class Strategy extends Game {
    private int maxUnits;
    private int mapCount;
    private boolean canCreateMap;

    public Strategy(){
        super();
        this.canCreateMap = true;
        this.mapCount = 10;
        this.maxUnits = 1000;
    }
    public Strategy(int releaseYear,double rating,  int mapCount){
        super(releaseYear,rating);
        this.mapCount = mapCount;
        this.maxUnits = 1200;
        this.canCreateMap = false;
    }
    public Strategy(String name, int releaseYear, double rating, String os,
                    int maxUnits, int mapCount, boolean canCreateMap) {
        super(name,releaseYear,rating,os);
        this.maxUnits = maxUnits;
        this.mapCount = mapCount;
        this.canCreateMap = canCreateMap;
    }

    public boolean isCanCreateMap() {
        return canCreateMap;
    }

    public int getMapCount() {
        return mapCount;
    }

    public int getMaxUnits() {
        return maxUnits;
    }

    @Override
    public String getGameType(){
        return "Стратегия";
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Максимальное кол-во юнитов = "+getMaxUnits());
        System.out.println("Кол-во карт = "+mapCount);
        if (canCreateMap){
            System.out.println("Карты можно создавать");
        }else {
            System.out.println("Карты создавать нельзя");
        }
    }
}
