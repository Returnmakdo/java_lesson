package koreait.day11;

public class AShapeTest {
//main �޼ҵ�� Ŭ������ ������� ���ø����̼��Դϴ�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
//					
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName="��";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("���� = "+ cir.getArea());
		
		Rectangle rec = new Rectangle();
		rec.height = 100;
		rec.width = 200;
		rec.shapeName = "���簢��";
		System.out.println("���� = " + rec.getArea());
	}
}//AShapeTest
/*
 * ���� : �޼ҵ� �������� �� ����������
 * �θ� public -> �ڽ� default : ����
 * �θ� default -> �θ� public : ����
 */


abstract class AShape {		//����
	protected String shapeName;
	protected int width;
	protected int height;
	public AShape() {		//AShape()�� ��ü�� ���� ������� �ڽ� ��ü ������� �� ����
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	}
	
	public AShape(int widht,int height) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width = widht;
		this.height = height;
	}
	
	public abstract double getArea();	 //������ ����
	
	
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ��� Ŭ������ ������ ����
	public Object explain() {	//���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}
	@Override
	public String toString() {
		return "AShape [���� ���� =" + shapeName + ", width=" + width + ", height=" + height + "]";
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
class Circle extends AShape{	//������ * ������ * 3.14
	private int radius; //������

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [������ =" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
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
