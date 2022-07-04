import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag bag3 = new Bag();

        bag1.addSeveralObjects(new Sphere("Яблоко"), 20);
        bag1.addObject(new Flat("Книга"));
        bag1.addObject(new Cylinder("Кока-Кола"));

        bag2.addSeveralObjects(new Sphere("Теннисный мяч"), 50);
        bag2.addObject(new Flat("Папка"));
        bag2.addObject(new Cylinder("Бутылка воды"));

        bag3.addSeveralObjects(new Sphere("Яблоко"), 10);
        bag3.addSeveralObjects(new Sphere("Теннисный мяч"), 3);
        bag3.addObject(new Flat("Папка"));
        bag3.addObject(new Cylinder("Кока-Кола"));


        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);

    }
}
