package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	// 기본생성자가 숨어있다. 어떤코드일까요?  접근한정자는 public
	public Score() {
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}
	
	// 인스턴스 메소드 : 필드값을 활용하는 경우
	public int sum() {
		int result =  this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	//setter를 변경하기 : 실행내용. 필요에 따라서는 접근한정자를 private으로도 할 수 있따.
	private void setGrade() {
		if(average() >= 90) this.grade = "A";
		else if(average() >= 80) this.grade = "B";
		else if(average() >= 70) this.grade = "C";
		else if(average() >= 60) this.grade = "D";
		else this.grade = "F";
	}
	
	String getGrade() {
		setGrade();
		return grade;
	}

	void setKorean(int korean) {
		this.korean = korean;
		// 메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장
	}
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;
	}
	int getEnglish() {
		return english;
	}
	
	void setScience(int science) {
		this.science = science;
	}
	int getScience() {
		return science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
