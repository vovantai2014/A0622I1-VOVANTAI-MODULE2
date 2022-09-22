package ss7_abstract_and_interface.thuc_hanh.animal_and_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken sound : cuc cuc";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
