package HW6;

public class TestAnimal {
    public static void main(String[] args) {
        GuideDog dog1 = new GuideDog();
        dog1.name = "Sam";
        dog1.isTrained=true;
        System.out.println(dog1.makeVoice());

    }
}
