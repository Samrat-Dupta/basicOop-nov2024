package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2 {
    @Override
    public void demo1(){
        System.out.println("abc value is :" + SampleClass.abc);
        System.out.println("demo1 implementation inside sample class ");
    }
    @Override
    public void demo2(){
        System.out.println("abc value is :" + SampleClass.xyz);
        System.out.println("demo2 implementation inside sample class");
    }

    public void demo3(){
        System.out.println("private demo3 body");
    }

}
