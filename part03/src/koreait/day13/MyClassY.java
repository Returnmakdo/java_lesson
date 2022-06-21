package koreait.day13;

//InterfaceB의 구현체
public class MyClassY implements InterfaceB{

	@Override
	public String name(String name) {
		return "MyClassY : " + name;
	}
	
}

//InterfaceA,B 의 구현체 (다중구현)
class MyClassZ implements InterfaceA, InterfaceB{

	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassZ methodB");
		return 3333;
	}
	
	@Override
	public String name(String name) {
		return "MyClassZ : " + name;
	}
	
}
