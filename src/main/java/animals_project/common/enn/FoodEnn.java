package animals_project.common.enn;

public enum FoodEnn {

    MEAT("мясо"),
    GRASS("трава"),
    FISH("рыбку"),
    BEETLE("жук");

    public String getValue() {
        return this.value;
    }

    private String value;
    FoodEnn(String value) {
        this.value = value;
    }
}
