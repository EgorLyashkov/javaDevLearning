package animals_project_decorator.common;

import animals_project_decorator.base.Animal;
import animals_project_decorator.base.AnimalDecorator;
import animals_project_decorator.common.filling.ColorFilling;

public class Color extends AnimalDecorator {

    ColorFilling colorFilling = new ColorFilling();

    public Color(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getDescription() {
        return animal.getDescription() + colorFilling.getColorFilling(animal.getName());
    }

    @Override
    public String getName(){
        return animal.getName();
    }
}
