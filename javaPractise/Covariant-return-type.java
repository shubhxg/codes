/* Java version 5.0 (2004) onwards it is possible to have different return types for an overriding method in the child class, 
but the child’s return type should be a subtype of the parent’s return type. 
The overriding method becomes variant with respect to return type. */



class A1  
{  
    A1 foo() {  
        return this;  
    }  
      
    void print() {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
class A2 extends A1  
{  
    @Override  
    A1 foo() {  
        return this;  
    }  
      
    void print() {  
        System.out.println("Inside the class A2");  
    }  
}  
  
class A3 extends A2  
{  
    @Override  
    A1 foo() {  
        return this;  
    }  
      
    @Override  
    void print() {  
        System.out.println("Inside the class A3");  
    }  
}  
  
public class Main {  
    public static void main(String argvs[]) {  
       A1 a1 = new A1();  
       a1.foo().print();  
         
       A2 a2 = new A2();  
       // we need to do the type casting to make it   
       // more clear to reader about the kind of object created   
       ((A2)a2.foo()).print();  
         
       A3 a3 = new A3();  
       // doing the type casting  
       ((A3)a3.foo()).print();      
    }  
}
