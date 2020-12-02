public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "duck";
    }

    @Override
    public String makeSound() {
        return "squaak!";
    }

    @Override
    public int amountOfLegs() {
        return 2;
    }
}
