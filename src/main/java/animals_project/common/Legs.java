package animals_project.common;

import animals_project.base.Animal;
import animals_project.base.AnimalDecorator;
import animals_project.common.filling.LegsFilling;

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
