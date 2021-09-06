package HW6;

public class Dog extends Pets{

    @Override
    public String makeVoice() {
        return super.makeVoice()
                .concat("Woof. ");
    }
}
