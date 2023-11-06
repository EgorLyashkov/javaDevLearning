package animals_project.common;

import animals_project.base.Animal;
import animals_project.base.AnimalDecorator;
import animals_project.common.filling.ColorFilling;
import animals_project.common.filling.SoundFilling;

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
