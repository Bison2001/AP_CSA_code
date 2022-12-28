public class Crab {
    private double hp;
    private double offense;
    private double defense;

    private int num_qianzi;
    private int num_legs;

    public Crab() {
        // TODO: initialize instance variable
        // Initialize hp to 100, offense to 12, defense to 15, num_qianzi to 2, and num_legs to 8

    }

    public double view_hp() {
        // TODO: return current hp
        return 0;
    }

    public double view_offense() {
        return this.offense;
    }

    public int view_qianzi() {
        // TODO: return the number of qianzi of current crab
        return 0;
    }

    public int view_legs() {
        // TODO: return the number of legs of current crab
        return 0;
    }


    public void under_attack(Shark shark, double shark_offense) {
        // TODO: deduct the hp of the crab by the following formula hp_change = max(opponent offense - carb defense, 0)
        // that is deducting opponent offense - shark defense if it is greater than 0, otherwise deduct 0
        // if the hp_change is greater than 20, the crab will loss a leg

    }

    public void heal(double hp_change) {
        // TODO: add the crab's hp by hp_change
    }

    public void attack(Shark shark) {
        // TODO: attack the given shark. Notice that you need to use shark.under_attack()
            
    }
    

    public void lian_huan_tui(Shark shark) {
        // TODO: attack the given shark for n times, where n is the number of legs
        // and for each time, the offense is only half of original offense
        // Notice that you need to use shark.under_attack()

    }

}
