package dictionaryPractice;

public class DicWord {
	
	public static final int BASIC = 1;
	public static final int PRACTICAL = 2;
	public static final int EXPERT = 3;
	
	private String math;
	private String science;
	private int grade;
	
	public DicWord() {
		
	}
	
	public DicWord(String math, String science) {
		this.math = math;
		this.science = science;
	}
	
	public DicWord(String math, String science, int grade) {
		this.math = math;
		this.science = science;
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return math + " " + science + " " + grade + "(" + 
				(this.grade == BASIC? "기초" : this.grade == PRACTICAL? "중급" : "고급" + ")");
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}
