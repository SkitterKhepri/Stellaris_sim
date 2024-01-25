import java.util.*;

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
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();


    public Ship(Size size, String name, int hull, int armor, int shields){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    //---------------------------------------

    public Size getSize(){
        return this.size;
    }

    public void setSize(Size size){
        this.size = size;
    }
    //-----------------------------------------

    public int getShields(){
        return this.shields;
    }

    public void setShields(int shields){
        this.shields = shields;
    }
    //-----------------------------------------

    public int getArmor(){
        return this.armor;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }
    //-----------------------------------------

    public int getHull(){
        return this.hull;
    }

    public void setHull(int hull){
        this.hull = hull;
    }
    //--------------------------------------------

    public int getEvasion(){
        return this.evasion;
    }

    public void setEvasion(int evasion){
        this.evasion = evasion;
    }
    //------------------------------------------

    public int getShipTracking(){
        return this.shipTracking;
    }

    public void setShipTracking(int shipTracking){
        this.shipTracking = shipTracking;
    }
    //--------------------------------------------

    public double getDmgBonus(){
        return this.dmgBonus;
    }

    public void setDmgBonus(double dmgBonus){
        this.dmgBonus = dmgBonus;
    }
    //--------------------------------------------

    public double[] getDefBonus(){
        return this.defBonus;
    }

    public void setDefBonus(double defBonus1, double defBonus2, double defBonus3){
        for (int i = 1; i < 4; i++) {
            switch (i) {
                case 1:
                    this.defBonus[i-1] = defBonus1;
                    break;
            
                case 2:
                    this.defBonus[i-1] = defBonus2;
                    break;
                case 3:
                    this.defBonus[i-1] = defBonus3;
                    break;
                default:
                    break;
            }
        }
    }
    //--------------------------------------------

    public ArrayList<Weapon> getWeapons(){
        return this.weapons;
    }

    public void setDmgBonus(Weapon weapon){
        this.weapons.add(weapon);
    }
    

    
}
