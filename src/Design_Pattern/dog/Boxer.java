package Design_Pattern.dog;

import Design_Pattern.dog.Abstract_Dog;

public class Boxer extends Abstract_Dog {
    public Boxer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(" My name is " + this.getName() + " and I am running");
    }

    @Override
    public void bark() {

    }
}
