package testing;

interface Interface1{
	void method1();
	default void log() {
		System.out.println("inside interface 1");
	}
}

interface Interface2{
	void method2();
	default void log() {
		System.out.println("inside interface 2");
	}
}

public class TestInterface implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		Interface2.super.log();
	}


}
