package animals_project.aqua;

import animals_project.base.Animal;
import animals_project.common.enn.AnimalEnn;

public class Shark extends Animal {

    public Shark() {
        this.name = AnimalEnn.SHARK.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
