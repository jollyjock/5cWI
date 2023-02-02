package dog;

public class Poodle extends Abstract_Dog{
    public Poodle(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(" My name is " + this.getName() + " and you cant catch me");
    }

    @Override
    public void bark() {
    }
}
