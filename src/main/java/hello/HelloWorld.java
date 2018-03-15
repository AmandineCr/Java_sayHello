package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Animal Human1,Animal2;
        Human1 = new Human();
        Animal2 = new Dog();
        System.out.println(Human1.sayHello());
        System.out.println(Animal2.sayHello());
    }
}