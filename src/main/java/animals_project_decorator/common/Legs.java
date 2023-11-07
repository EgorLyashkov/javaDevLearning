package animals_project_decorator.common;

import animals_project_decorator.base.Animal;
import animals_project_decorator.base.AnimalDecorator;
import animals_project_decorator.common.filling.LegsFilling;

public class Legs extends AnimalDecorator {

    LegsFilling legsFilling = new LegsFilling();
    public Legs(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getDescription() {
        return animal.getDescription() + legsFilling.getLegsFilling(animal.getName());
    }

    @Override
    public String getName() {
        return animal.getName();
    }
}
