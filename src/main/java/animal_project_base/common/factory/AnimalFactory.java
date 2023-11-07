package animal_project_base.common.factory;

import animal_project_base.bear.BaseBear;
import animal_project_base.common.enn.AnimalEnn;

public class AnimalFactory {

    public String getAnimal(AnimalEnn animalEnn, String color, String food) {
        switch (animalEnn) {
            case BEAR:
                BaseBear bear = new BaseBear();
                bear.setColor(color);
                bear.setFood(food);
                bear.setName(bear.getName() + " _через сеттеры и геттеры_");
                return bear.getDescription();
            default:
                throw new IllegalStateException("Unexpected value: " + animalEnn);
        }
    }

    public String getAnotherAnimal(AnimalEnn animalEnn, String color, String food) {
        switch (animalEnn) {
            case BEAR:
                BaseBear bear = new BaseBear(color, food);
                bear.setName(bear.getName() + " _через конструктор_");
                return bear.getDescription();
            default:
                throw new IllegalStateException("Unexpected value: " + animalEnn);
        }
    }
}
