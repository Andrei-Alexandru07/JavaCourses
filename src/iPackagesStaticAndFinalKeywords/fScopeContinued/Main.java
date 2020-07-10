package iPackagesStaticAndFinalKeywords.fScopeContinued;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        //System.out.println("var three is not accessible here " + innerClass.varThree);
        /*System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();

        System.out.println("*****************************************************");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();*/


    }
}
