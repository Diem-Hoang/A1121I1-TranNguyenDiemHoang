package ss7.ThucHanh.animal;

import ss7.ThucHanh.edible.Edible;

public class Tests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            animal.makeSound();

            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
