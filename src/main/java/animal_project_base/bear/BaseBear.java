package animal_project_base.bear;

import animal_project_base.base.BaseAnimalInt;

public class BaseBear implements BaseAnimalInt {

    private String sound = ", говорит \"РрРрРрРр\"";
    private String color;
    private String food;
    private String legs = ", у него 4 лапки";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Это Медведь";
    private String description;

    public BaseBear() {
    }

    public BaseBear(String color, String food) {
        this.color = color;
        this.food = food;
    }


    @Override
    public String getDescription() {
        return this.description = name + sound + color + food + legs;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
