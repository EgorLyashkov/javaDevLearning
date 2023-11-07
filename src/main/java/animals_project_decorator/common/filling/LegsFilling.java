package animals_project_decorator.common.filling;

import animals_project_decorator.common.enn.AnimalEnn;

public class LegsFilling {

    private String value;

    public String getLegsFilling(String animalName) {

        if (animalName.equals(AnimalEnn.BEAR.getValue())) {
            value = ", у него 4 лапы";
        }
        if (animalName.equals(AnimalEnn.CAT.getValue())) {
            value = ", у котиков 4 лапки";
        }
        if (animalName.equals(AnimalEnn.SHARK.getValue())) {
            value = ", у акулы нет лапок или ног, но зато у нее есть плавники";
        }
        return value;
    }
}
