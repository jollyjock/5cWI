package Design_Pattern.dog;

import Design_Pattern.dog.BarkStrategy;

public class Wuuuf implements BarkStrategy {

    @Override
    public void bark() {
        System.out.println("Wuuf");
    }
}
