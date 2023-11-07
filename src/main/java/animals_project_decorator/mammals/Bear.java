package animals_project_decorator.mammals;

import animals_project_decorator.base.Animal;
import animals_project_decorator.common.enn.AnimalEnn;

public class Bear extends Animal {

    public Bear() {
        this.name = AnimalEnn.BEAR.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
