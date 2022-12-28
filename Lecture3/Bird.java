class Bird {

    public double weight_public = 2;
    private double weight_private = 2;

    private double weight;

    // basically, you can use both private and public variable anywhere in the class
    public double test_use = weight_private;

    public static boolean living_condition_good_or_not = true;

    // // use constructor to initialize instance variable
    
    public Bird(double initial_weight) {
        this.weight = initial_weight;
    }

    public Bird() {
        this.weight = 10;
    }

    // this method allow object to use private variable
    public double get_weight() {
        // see, you can use private variable anywhere inside the class
        return this.weight;
    }

    public void eat(double amount) {
        this.weight = this.weight + amount;
    }

    // private double square(double x) {
    //     // f(x) = x^2
    //     return x*x;
    // }


    public static void change_living_condition() {
        living_condition_good_or_not = !living_condition_good_or_not;
    }
}
