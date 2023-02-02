package dog;

public class Main {
    public static void main(String[] args) {
        BarkStrategy barkStrategy;
        Boxer b1 = new Boxer("susie");
        Poodle p1 = new Poodle("cookie");

        b1.run();
        p1.run();
    }
}
