package HW6;

public class Animals {

    protected int id;
    protected int age;
    protected double weight;
    Colours colour;

    public String makeVoice(){
        return "Hello, I'm " + objectClassName() + ". ";
    }

    public String objectClassName(){
        String str = this.getClass().getName();     // catching class name of object what's called
        String[] words = str.split("6.");
        String name = (words[1]);
        return name;
    }
}
