package accessModifiersTesting;

import javaBasics.MethodDeclarations;

public class SampleClass {

    public static void main(String[] args) {

        //If we want to call a static method from another class
        //ClassName.methodName();

        //Cannot access openWhatsapp method because it is a private method
//        MethodDeclarations.openWhatsapp();

        //Cannot access sumOfTwoNumbers method because it is a default method
        //Default methods are accessible within the package not outside the package
//        MethodDeclarations.sumOfTwoNumbers(10,20);

        MethodDeclarations.sumOfTwoNumbers(50.4, 24.002);
    }
}
