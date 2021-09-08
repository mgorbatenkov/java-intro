package guru.qa;

public class Cat {
    String name, color;
    int age, weight;
    boolean isSleeping = true;

    public Cat(int age, int weight, String name, String color) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void wakeUp() {
        if (isSleeping) {
            System.out.println("You woke up " + name);
        } else {
            System.out.println("Cat does not sleep");
        }
        isSleeping = false;
    }

    public void pet() {
        System.out.println(name + " purrs");
    }

    public void feed() {
        pet();
        weight++;
        isSleeping = true;
        System.out.println("Cat increased weight and falls asleep");
    }

    public void isHeavierThan(Cat cat1) {
        if (weight > cat1.weight) {
            System.out.println(this.name + " heavier than " + cat1.name);
        } else if (weight < cat1.weight) {
            System.out.println(this.name + " lighter than " + cat1.name);
        } else {
            System.out.println("cats weigh the same");
        }
    }
}
