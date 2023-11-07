package animals_project_decorator.common.filling;

import animals_project_decorator.common.enn.AnimalEnn;

import static animals_project_decorator.common.enn.AnimalEnn.*;

public class ColorFilling {

    private String value;

    public String getColorFilling(String animalName) {
        /*AnimalEnn name = null;
        AnimalEnn[] list = new AnimalEnn[]{BEAR, CAT, SHARK};

        for (AnimalEnn str : list){
            if (animalName.equals(str.getValue())) {
                name = str;
                break;
            }
        }

        switch (name) {
            case BEAR:
                value = ", шерстка у него бывает разная, например, коричневая, бурая, белая или черная";
            case CAT:
                value = ", шерстка у него бывает разная, например, коричневая, бурая, белая или черная";
            case SHARK:
                value = ", цвет у нее бывает разным, например, ярко-синий, серо-белый";

        }
        return value;
*/        if (animalName.equals(BEAR.getValue())) {
            value = ", шерстка у него бывает разная, например, коричневая, бурая, белая или черная";
        }
        if (animalName.equals(AnimalEnn.CAT.getValue())) {
            value = ", шерстка у него бывает разная, например, коричневая, бурая, белая или черная";
        }
        if (animalName.equals(AnimalEnn.SHARK.getValue())) {
            value = ", цвет у нее бывает разным, например, ярко-синий, серо-белый";
        }
        return value;
    }
}
