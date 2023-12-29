package Package1;

import Package1.Class1;

public class AccessModificatorTest {
    public static void main(String[] args) {
        Class1 class_one = new Class1("Public ");
        class_one.setPrivateAttribute("Private attribute changed");
        System.out.println("class_one = " + class_one.getPrivateAttribute());
    }
}
