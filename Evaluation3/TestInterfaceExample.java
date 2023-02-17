package Evaluation3;

class Arithmetic implements TestInterface{

    @Override
    public void square() {
        System.out.println("Arithmetic is square");
    }
}
class TestInt implements TestInterface{

    @Override
    public void square() {
        System.out.println("testint square");
    }
}


public class TestInterfaceExample {
    public static void main(String[] args) {
     Arithmetic arithmetic;
        arithmetic =new Arithmetic();
        arithmetic.square();
        //arithmetic=new TestInt()
        TestInt testInt=new TestInt();
         testInt.square();
    }
}

/*=========OUTPUT============
* Arithmetic is square
testint square
*/
