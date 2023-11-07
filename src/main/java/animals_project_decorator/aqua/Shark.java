package animals_project_decorator.aqua;

import animals_project_decorator.base.Animal;
import animals_project_decorator.common.enn.AnimalEnn;

public class Shark extends Animal {

    public Shark() {
        this.name = AnimalEnn.SHARK.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
