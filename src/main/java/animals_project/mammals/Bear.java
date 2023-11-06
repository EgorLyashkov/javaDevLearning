package animals_project.mammals;

import animals_project.base.Animal;
import animals_project.common.enn.AnimalEnn;

public class Bear extends Animal {

    public Bear() {
        this.name = AnimalEnn.BEAR.getValue();
    }

    @Override
    public String getDescription() {
        return "Это " + this.name;
    }
}
