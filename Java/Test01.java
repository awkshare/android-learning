//��������Ǽ���ѧϰ�ɼ��������в���ҶԲ��������ݽ����ж� 
public class Test01{
	public static void main(String args []){
		int score = 60;
		if(score >85 && score <=100){
			System.out.println("�ɼ�Ϊ��");
		}
		else if(score > 75 && score <= 85){
			System.out.println("�ɼ�Ϊ��");
		}
		else if(score >= 60 && score <= 75){
			System.out.println("�ɼ�Ϊ��");
		}
		else if(score >= 0 && score < 60){
			System.out.println("�ɼ�Ϊ��");
		}
		else if(score > 100 || score < 0){
			System.out.println("���Ǻ�������");
		}
	}
}