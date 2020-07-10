package iPackagesStaticAndFinalKeywords.jFinalKeyword;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // one.instanceNumber = 4;
        System.out.println(Math.PI);
        // Math m = new Math();

        int password = 674312;
        Password password1 = new *//*Password*//* ExtendedPassword(password);
        password1.storePassword();
        password1.letMeIn(674312);*/

        System.out.println("Main method called");
        StaticInitializationBlockTest test = new StaticInitializationBlockTest();
        test.someMethod();
        System.out.println("Owner is " + StaticInitializationBlockTest.owner);
    }
}
