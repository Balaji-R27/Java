interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    public void sound() { System.out.println("Dog barks."); }
    public void eat() { System.out.println("Dog eats bones."); }
}

class Cat implements Animal {
    public void sound() { System.out.println("Cat meows."); }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
    
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();

        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
