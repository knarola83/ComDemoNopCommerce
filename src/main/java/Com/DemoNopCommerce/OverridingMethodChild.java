package Com.DemoNopCommerce;

public class OverridingMethodChild extends OverriddingMethodParent {

    void test1(String a)
    {
        System.out.println("Child class method");
    }

    void test2()
    {
        System.out.println("child class method 2");
    }

    public static void main(String[] args) {
//        OverriddingMethodParent obj = new OverridingMethodChild();
//        obj.test1("a");
//
        OverriddingMethodParent obj1 = new OverriddingMethodParent();
//        obj1.test1("a");

        OverridingMethodChild child = new OverridingMethodChild();
        child.test1("a");
    }
}
