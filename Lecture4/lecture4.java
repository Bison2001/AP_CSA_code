public class lecture4 {
    public static void main (String args[]) {
        
        int x = 2;
        fake_add(x);
        // Now guess what is the value of 
        System.out.println(x);

        x = real_add(x);
        // Now guess what is the value of 
        System.out.println(x);


        Dog dog1 = new Dog();
        force_dog_to_eat(dog1);
        // Now guess what is the value of weight of dog1
        System.out.println(dog1.get_weight());


        Dog dog2 = null;
        change_reference(dog2);
        // Now guess what is the value of dog2
        System.out.println(dog2.get_weight());

    }

    public static void fake_add(double x) {
        x = x + 1;
    }

    public static int real_add(int x) {
        x = x + 1;
        return x;
    }

    public static void change_reference(Dog d) {
        Dog dog1 = new Dog();
        d = dog1;
    }

    public static void force_dog_to_eat(Dog d) {
        d.eat(5);
    }
}