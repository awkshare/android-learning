//这个例子是计算学习成绩的优良中差，并且对不合理数据进行判断 
public class Test01{
	public static void main(String args []){
		int score = 60;
		if(score >85 && score <=100){
			System.out.println("成绩为优");
		}
		else if(score > 75 && score <= 85){
			System.out.println("成绩为良");
		}
		else if(score >= 60 && score <= 75){
			System.out.println("成绩为中");
		}
		else if(score >= 0 && score < 60){
			System.out.println("成绩为差");
		}
		else if(score > 100 || score < 0){
			System.out.println("不是合理数据");
		}
	}
}