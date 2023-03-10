package animals;

import edible.IEdiable;

public class Chicken extends Animals implements IEdiable {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    public String howToEat(){
        return "could be fried";
    }
}
