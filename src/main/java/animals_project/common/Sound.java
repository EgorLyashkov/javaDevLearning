package animals_project.common;

import animals_project.base.Animal;
import animals_project.base.AnimalDecorator;
import animals_project.common.filling.SoundFilling;

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
