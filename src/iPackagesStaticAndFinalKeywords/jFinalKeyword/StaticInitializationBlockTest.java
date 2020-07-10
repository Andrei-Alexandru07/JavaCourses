package iPackagesStaticAndFinalKeywords.jFinalKeyword;

public class StaticInitializationBlockTest {

    public static final String owner;

    static {
        owner = "tim";
        System.out.println("StaticInitializationBlockTest static initialization block called");
    }

    public StaticInitializationBlockTest(){
        System.out.println("StaticInitializationBlockTest constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }

}
