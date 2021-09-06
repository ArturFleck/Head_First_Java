package HW6;

public class Pets extends GroundAnimals {
    protected String name;
    protected boolean isVaccinated;
    protected boolean isTrained;

    @Override
    public String makeVoice() {
        return (super.makeVoice()
                .concat((name != null) ? String.format("My name is %s. ", name) : ""))
                .concat("I'm pet animal. ");
    }

    public void voice() {
        System.out.println("\nHi there I'm " + objectClassName() + ".");
        System.out.println("My name is " + name);
    }
}
