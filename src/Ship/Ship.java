package Ship;

enum Size {
    CORVETTE, FRIGATE, DESTROYER, CRUISER, BATTLESHIP, TITAN, COLOSSUS, DEFENSE_PLATFORM, STARBASE
};
enum SlotSize{
    SMALL, MEDIUM, LARGE
};

public abstract class Ship {

    private String name = "Placeholder";
    private Size size;
    private int shields = 0;
    private int armor = 0;
    private int hull = 0;
    private int evasion = 0;
    private int shipTracking = 0;
    private double dmgBonus = 0;
    private double[] defBonus = {0, 0, 0};


    public Ship(Size size, String name, int hull, int armor, int shields){

    }

    
}
