package animals_project_decorator.common;

import animals_project_decorator.base.Animal;
import animals_project_decorator.base.AnimalDecorator;
import animals_project_decorator.common.filling.FoodFilling;

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
