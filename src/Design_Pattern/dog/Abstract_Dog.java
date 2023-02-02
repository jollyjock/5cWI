package Design_Pattern.dog;

public abstract class Abstract_Dog implements Dog {
    private String name;

    public Abstract_Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}