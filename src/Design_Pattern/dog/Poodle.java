package Design_Pattern.dog;

import Design_Pattern.dog.Abstract_Dog;

public class Poodle extends Abstract_Dog {
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
