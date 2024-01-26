public class Weapon {

    private double[] dmg = {0, 0};
    private double cd = 0;
    private int[] dmgMods = {0, 0, 0};
    private int weaponTracking = 0;
    private double[] range = {0, 0};



    public double[] getDmg(){
        return this.dmg;
    }
    public void setDmg(double dmgR1, double dmgR2){
        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1:
                    this.dmg[i-1] = dmgR1;
                    break;
            
                case 2:
                    this.dmg[i-1] = dmgR2;
                    break;

                default:
                    break;
            }
        }
    }


    public double getCd(){
        return this.cd;
    }
    public void setCd(double cd){
        this.cd = cd;
    }


    public int[] getDmgBonus(){
        return this.dmgMods;
    }
    public void setDmgMods(int dmgMod1, int dmgMod2, int dmgMod3){
        for (int i = 1; i < 4; i++) {
            switch (i) {
                case 1:
                    this.dmgMods[i-1] = dmgMod1;
                    break;
            
                case 2:
                    this.dmgMods[i-1] = dmgMod2;
                    break;
                case 3:
                    this.dmgMods[i-1] = dmgMod3;
                    break;
                default:
                    break;
            }
        }
    }


    public int getWeaponTracking(){
        return this.weaponTracking;
    }
    public void setWeaponTracking(int wTracking){
        this.weaponTracking = wTracking;
    }


    public double[] getRange(){
        return this.dmg;
    }
    public void setRange(double range1, double range2){
        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1:
                    this.range[i-1] = range1;
                    break;
            
                case 2:
                    this.range[i-1] = range2;
                    break;

                default:
                    break;
            }
        }
    }
}
