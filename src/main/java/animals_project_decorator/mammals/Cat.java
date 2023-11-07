package animals_project_decorator.mammals;

import animals_project_decorator.base.Animal;
import animals_project_decorator.common.enn.AnimalEnn;

public class Cat extends Animal {
    public Cat() {
        this.name = AnimalEnn.CAT.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
