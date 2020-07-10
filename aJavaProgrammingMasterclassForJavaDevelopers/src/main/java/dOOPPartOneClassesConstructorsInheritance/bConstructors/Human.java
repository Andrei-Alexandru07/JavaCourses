package dOOPPartOneClassesConstructorsInheritance.bConstructors;


public class Human {

    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;
    private String eyesColour;
    private String hairColour;

    public  Human() {
        this("Default name","Default gender",0,0,0,"Default eyes colour","Default hair colour");
        System.out.println("A human object with default parameters was created.");
    }

    public Human(String name, String gender, int age, int height, int weight, String eyesColour, String hairColour){
        System.out.println(name + " was created as a personalized human object.");
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.eyesColour=eyesColour;
        this.hairColour=hairColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyesColour() {
        return eyesColour;
    }

    public void setEyesColour(String eyesColour) {
        this.eyesColour = eyesColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
}
