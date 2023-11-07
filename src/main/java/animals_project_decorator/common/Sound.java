package animals_project_decorator.common;

import animals_project_decorator.base.Animal;
import animals_project_decorator.base.AnimalDecorator;
import animals_project_decorator.common.filling.SoundFilling;

public class Sound extends AnimalDecorator {

    SoundFilling soundFilling = new SoundFilling();

    public Sound(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getDescription() {
        return animal.getDescription() + soundFilling.getSoundFilling(animal.getName());
    }

    @Override
    public String getName(){
        return animal.getName();
    }
}
