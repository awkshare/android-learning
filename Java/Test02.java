//���������дʯͷ��������aʯͷ��b������c��
public class Test02{
	public static void main(String args []){
		char play1 = 'a';
		char play2 ='b';
		if(play1 == 'a' && play2 == 'a') {
			System.out.println('ƽ');
		}
		else if(play1 == 'a' && play2 == 'b'){
			System.out.println("play1���Ӯ��");
		}
		else if(play1 == 'a' && play2 == 'c'){
			System.out.println("play2���Ӯ��");
		}
		else if(play1 == 'b' && play2 == 'a'){
			System.out.println("play2���Ӯ��");
		}
		else if(play1 == 'b' && play2 == 'b'){
			System.out.println("ƽ��");
		}
		else if(play1 == 'b' && play2 == 'c'){
			System.out.println("play2���Ӯ��");
		}
		else if(play1 == 'c' && play2 == 'a'){
			System.out.println("play1���Ӯ��");
		}
		else if(play1 == 'c' && play2 == 'b'){
			System.out.println("play2���Ӯ��");
		}
		else if(play1 == 'c' && play2 == 'c'){
			System.out.println("ƽ��");
		}
	}
}