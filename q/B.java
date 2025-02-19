import p.A;

public class B extends A {
    public static void main(String[] args) {
        A objA = new A();
        
        // Accessing methods from class A
        objA.publicMethod();  //  Accessible: Public
        // objA.protectedMethod(); //  Not accessible directly (needs inheritance)
        //objA.defaultMethod();   //  Not accessible outside package
        // objA.privateMethod();   //  Not accessible anywhere outside class A

        // Accessing protected method via inheritance
        B objB = new B();
        objB.protectedMethod(); //  Accessible: Protected via subclass
        objA.accessPrivateMethod(); //  Indirectly access private method
        
    }
}
