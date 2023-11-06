package animals_project.common;

import animals_project.base.Animal;
import animals_project.base.AnimalDecorator;
import animals_project.common.enn.FoodEnn;
import animals_project.common.filling.FoodFilling;

public class Food extends AnimalDecorator {
    FoodFilling foodFilling = new FoodFilling();

    public Food(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getDescription() {
        return animal.getDescription() + foodFilling.getFoodFilling(animal.getName());
    }

    @Override
    public String getName() {
        return animal.getName();
    }
}
