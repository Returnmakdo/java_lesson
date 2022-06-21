package koreait.day11;

public class AShapeTest {
//main 메소드는 클래스로 만들어진 애플리케이션입니다. 추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 추가하면?
//					
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "직각삼각형";
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName="원";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("넓이 = "+ cir.getArea());
		
		Rectangle rec = new Rectangle();
		rec.height = 100;
		rec.width = 200;
		rec.shapeName = "직사각형";
		System.out.println("넓이 = " + rec.getArea());
	}
}//AShapeTest
/*
 * 참고 : 메소드 재정의할 때 접근한정자
 * 부모 public -> 자식 default : 오류
 * 부모 default -> 부모 public : 가능
 */


abstract class AShape {		//도형
	protected String shapeName;
	protected int width;
	protected int height;
	public AShape() {		//AShape()는 객체는 직접 못만들고 자식 객체 만들어질 때 실행
		System.out.println("AShape 디폴트 생성자 동작합니다");
	}
	
	public AShape(int widht,int height) {
		System.out.println("AShape 커스텀 생성자 동작합니다");
		this.width = widht;
		this.height = height;
	}
	
	public abstract double getArea();	 //도형의 넓이
	
	
	//추상클래스도 인스턴스 메소드 정의해서 자식이 클래스가 재정의 가능
	public Object explain() {	//애플리케이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}
	@Override
	public String toString() {
		return "AShape [도형 종류 =" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}

class Triangle extends AShape{	//width * height/2
	public Triangle(int width, int height) {
		super(width,height);
	}
	
	@Override
	public double getArea() {

		return width*height/2;
	}
	
	
}
class Circle extends AShape{	//반지름 * 반지름 * 3.14
	private int radius; //반지름

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [반지름 =" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
class Rectangle extends AShape{	//width * height

	@Override
	public double getArea() {
		return width * height;
	}	
	
}
