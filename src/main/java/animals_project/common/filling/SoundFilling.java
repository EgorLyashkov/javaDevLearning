package animals_project.common.filling;

import animals_project.common.enn.AnimalEnn;

public class SoundFilling {

    private String value;

    public String getSoundFilling(String animalName) {

        if (animalName.equals(AnimalEnn.BEAR.getValue())) {
            value = ", он говорит \"РрРрРрРрРрРр\"";
        }
        if (animalName.equals(AnimalEnn.CAT.getValue())) {
            value = ", котик говорит \"Мау!\" ";
        }
        if(animalName.equals(AnimalEnn.SHARK.getValue())) {
            value = ", акула говорит \"буль буль буль\"";
        }
        return value;
    }
}
