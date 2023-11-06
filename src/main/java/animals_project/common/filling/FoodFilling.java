package animals_project.common.filling;

import animals_project.common.enn.AnimalEnn;
import animals_project.common.enn.FoodEnn;

public class FoodFilling {
    private String value;

    public String getFoodFilling(String animalName) {

        if (animalName.equals(AnimalEnn.BEAR.getValue())) {
            value = ", он обожает кушать " + FoodEnn.FISH.getValue() + ", " + FoodEnn.MEAT.getValue();
        }
        if (animalName.equals(AnimalEnn.CAT.getValue())) {
            value = ", он обожает кушать " + FoodEnn.FISH.getValue() + ", " + FoodEnn.MEAT.getValue()
                    + ", " + FoodEnn.GRASS.getValue().replace("ва", "ву") + ", "
                    + FoodEnn.BEETLE.getValue() + "ов";
        }
        if(animalName.equals(AnimalEnn.SHARK.getValue())) {
            value = ", она обожает кушать " + FoodEnn.FISH.getValue() + ", " + FoodEnn.MEAT.getValue();
        }
        /*else {
            return "";
        }*/
        return value;
    }
}
