package org.example;

import org.junit.Test;

public class MainTest {
    @Test
    public void testMethod() {
        System.out.println("This is a test");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is a second test, with properties");
        System.out.println(System.getProperties()) ;
    }

    @Test
    public void testMethod3() {
        System.out.println("This is a third test, with environment");
        System.out.println(System.getenv());
    }

}
