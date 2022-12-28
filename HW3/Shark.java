public class Shark {
    private double hp;
    private double offense;
    private double defense;


    public Shark() {
        // initialize instance variable. Initialize hp to 100, offense to be 30 and defense to be 2
        this.hp = 100;
        this.offense = 30;
        this.defense = 2;
    }
    public Shark(double hp, double offense, double defense) {
        this.hp = hp;
        this.offense = offense;
        this.defense = defense;
    }

    public double view_hp() {
        // return the shark's hp
        return this.hp;
    }

    public double view_offense() {
        return this.offense;
    }

    public void under_attack(Crab crab, double crab_offense) {
        // deduct the hp of the shark by the following formula hp_change = max(opponent offense - shark defense, 0)
        // that is deducting (crab's offense - shark defense) if it is greater than 0, otherwise deduct 0
        if (crab_offense - this.defense >= 0) {
            this.hp = this.hp - (crab_offense - this.defense);
        }
    }

    public void heal(double hp_change) {
        // add the shark's hp by hp_change
        this.hp = this.hp + hp_change;
    }

    public void attack(Crab crab) {
        // attack the given crab. Notice that you need to use crab.under_attack()
        crab.under_attack(this, this.offense);
    }

    public void fierce_attack(Crab crab) {
        // this is similar to attack except that your offense becomes 1.5 times original offense
        crab.under_attack(this, this.offense*1.5);

    }
}
