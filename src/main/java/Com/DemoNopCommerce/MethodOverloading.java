package Com.DemoNopCommerce;

import org.openqa.selenium.WebDriver;

public class MethodOverloading  {

    String test1(String a)
    {
        System.out.println("test1");
      return "bsag";
    }

    int test1(int a)
    {
        System.out.println();
        return a+a;

    }

    public static void main(String[] args) {
       // WebDriver driver;
        MethodOverloading obj = new MethodOverloading();
        obj.test1(10);
        System.out.println(obj.test1(10));
    }
}
