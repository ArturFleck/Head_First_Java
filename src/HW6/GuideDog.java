package HW6;

public class GuideDog extends Dog {


    @Override
    public String makeVoice() {
        return super.makeVoice()
                .concat((isTrained) ? "I can lead you home " : "");
    }
}
