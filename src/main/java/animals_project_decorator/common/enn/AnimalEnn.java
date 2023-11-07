package animals_project_decorator.common.enn;

public enum AnimalEnn {
    BEAR("Медведь"),
    CAT("Котик"),
    SHARK("Акула");

    private String value;
    public String getValue() {
        return this.value;
    }
    AnimalEnn(String value) {
        this.value = value;
    }
}
