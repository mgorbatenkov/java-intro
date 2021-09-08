package guru.qa;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, 8, "Barsik", "Black");
        Cat cat2 = new Cat("Vasiliy");
        cat2.weight = 10;
        cat2.isHeavierThan(cat1);
        cat2.wakeUp();
        cat2.wakeUp();
        cat1.feed();
        cat1.pet();
    }
}
