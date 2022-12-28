public class Cat_in_your_home {
    // define instance variable and static variable
    private double weight;
    private String color;
    private String type;

    public static double room_temp = 20;

    // constructor
    public Cat_in_your_home(double initial_weight, String initial_color, String initial_type) {
        weight = initial_weight;
        color = initial_color;
        type = initial_type;
    }

    // Encapsultion: let your object see its weight
    public double get_weight() {
        return weight;
    }
    public String get_color() {
        return color;
    }
    public String get_type() {
        return type;
    }

    // other instance method
    public void dye(String target_color) {
        color = target_color;
    }

    // some static method
    public static void change_room_temperature(double amount) {
        room_temp = room_temp + amount;
    }


    


}
