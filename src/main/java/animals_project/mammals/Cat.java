package animals_project.mammals;

import animals_project.base.Animal;
import animals_project.common.enn.AnimalEnn;

public class Cat extends Animal {
    public Cat() {
        this.name = AnimalEnn.CAT.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
