public class Main {
    public static void main(String args[]) {
        // create a bird object called little_bird
        Bird little_bird = new Bird(50);
        Bird large_bird = new Bird(200);

        // you can use object to call public instance variable
        System.out.println(little_bird.weight_public);

        // but you cannot use object to call private variable
        // little_bird.weight_private (not allowed)

        // you can use static variable
        System.out.println(Bird.living_condition_good_or_not);

        // use object to call a method
        System.out.println(little_bird.get_weight());

        // use object to call a method
        little_bird.eat(5);

        // use class name to call static method
        Bird.change_living_condition();

        // check the current living condition
        System.out.println(Bird.living_condition_good_or_not);


        Cat_in_your_home cat1 = new Cat_in_your_home(20, "Grey",  "Persia");
        System.out.println(cat1.get_color());
        cat1.dye("Red");
        System.out.println(cat1.get_color());
        System.out.println(Cat_in_your_home.room_temp);
        Cat_in_your_home.change_room_temperature(5);
        System.out.println(Cat_in_your_home.room_temp);
    }
}
