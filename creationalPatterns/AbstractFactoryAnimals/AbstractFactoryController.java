public class AbstractFactoryController {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal toy = (Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("brown");

        String result = "A " + toy.getAnimal() + " with " + color.getColor() + " color. " + toy.makeSound();

        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal duckling = (Animal) abstractFactory.create("Duck");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color colorDuck = (Color) abstractFactory.create("White");

        String result2 = "A " + duckling.getAnimal() + " with " + colorDuck.getColor() + " color. " + duckling.makeSound();

        System.out.println(result);
        System.out.println(result2);

    }
}
