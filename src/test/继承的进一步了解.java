package test;

public class 继承的进一步了解 {
    public static void main(String[] args) {
        //A a=new A();
        //B b=new B();
        C c = new C();
    }
}

class A {
    int a;

    public A() {
        super();
        a = 10;
        getPrint();
    }

    public void getPrint() {
        System.out.println(this.a);
    }
}
class B extends A {
    int a;

    public B() {
       /* getPrint(super.a);
        getPrint(((A)this).a);*/
        super();
        a = 20;
        getPrint();
    }

    public void getPrint() {
        System.out.println(this.a);
    }
}
class C extends B {
    int a;

    public C() {
       /* getPrint(super.a);
        getPrint(((A)this).a);*/
        super();
        a = 30;
        getPrint();
    }

    public void getPrint() {
        System.out.println(this.a);
    }
}