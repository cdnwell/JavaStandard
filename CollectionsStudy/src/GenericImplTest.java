public class GenericImplTest {
    public static void main(String[] args) {
        Box<Apple> fruitBox = new Box<Apple>();
        System.out.println(fruitBox);
    }
}

class Box<T extends Apple & Fruit> {
    @Override
    public String toString() {
        return "Hello, Boxes!";
    }
}

interface Fruit {
     String toApple();
}

class Apple implements Fruit {
    @Override
    public String toApple() {
        return "Hello, Apple!";
    }
}