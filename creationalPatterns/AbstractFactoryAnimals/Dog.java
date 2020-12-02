public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "doggo";
    }

    @Override
    public String makeSound() {
        return "woof!";
    }

    @Override
    public int amountOfLegs() {
        return 4;
    }
}
