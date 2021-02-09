package org.csystem.app;



class App {

    public static void main(String [] args) {

    }


    }
class B extends A {
    public void bar() {
        x = 10;
        foo();
    }

        }



class A {
    public int x;

    public void foo() {
        System.out.println("a.foo()");
    }
}
