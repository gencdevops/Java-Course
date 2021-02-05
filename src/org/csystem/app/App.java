package org.csystem.app;



class App {

    public static void main(String [] args) {
        B b = new B();


    }
}

class A{
  protected int x;
  public A() {
      System.out.println("default constructor");
  }
  public A(int m) {
      this();
      System.out.println("int parametreli");
  }
}
class B extends A{
    B() {
        super(10);
        System.out.println("b nin constructor");
    }
}