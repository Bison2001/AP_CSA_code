public class MovingParticle {
    // The file is originally created by Xuhui Liu (Bison). Please do not distribute it without my permission
    // You will need to implement the MovingParticle class. Everything you need to do is marked with TODO:
    // The class just represents a moving particle in the coordinate system

    // Define instance variable
    private double current_x;
    private double current_y;


    public MovingParticle() {
        // TODO:
        // initialize current coordinate to (0, 0)

    }

    public double get_current_x() {
        // TODO:
        // return current_x
        return this.current_x;
    }

    public double get_current_y() {
        // TODO:
        // return current_y
        return this.current_y;
    }

    public void move_north(double distance) {
        // TODO:
        // move the y coordinate of the particle by distance to north
        
    }

    public void move_south(double distance) {
        // TODO:
        
    }

    public void move_west(double distance) {
        // TODO:
        
    }

    public void move_east(double distance) {
        // TODO:
        
    }

    public void shrink_x_half(int n) {
        // TODO:
        // You need to multiply x coordinate by 0.5 for n times

    }

    public void shrink_y_half(int n) {
        // TODO:
        // You need to multiply y coordinate by 0.5 for n times

    }

    public void teleport(double target_x, double target_y) {
        // TODO:
        // move your current x,y to target location

    }

    public void strange_move () {
        // TODO:
        // first take the integer part of your x,y coordinate. If your x,y coordinate are both even, move north by 5
        // If your x coordinate is even, but y coordinate is odd, shrink_x_half 3 times. If your y coordinate is even,
        // but x coordinate is odd, shrink_y_half twice. If your x, y are odd, move south by 5.
        
    }

    public static void plot(MovingParticle p,  int size) {
        // TODO:
        // Assume the particle p is in 第一象限
        // plot the position of the particle in a coordinate of size: size by size
        // for example, if the particle is in (1,1), size is 5, you should generate the following plot
        /*

        ------
        ------
        ------
        ------
        -#----
        ------

        Basically, you will have a 6 by 6 plot filled with "-" where the particle position is filled with "#"

        */
        

    }




}
