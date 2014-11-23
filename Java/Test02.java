//这个例子是写石头剪刀布的
public class Test02{
	public static void main(String args []){
		char play1 = 'a';
		char play2 ='b';
		if(play1 == 'a' && play2 == 'a') {
			System.out.println('平');
		}
		else if(play1 == 'a' && play2 == 'b'){
			System.out.println("play1赢了");
		}
		else if(play1 == 'a' && play2 == 'b'){
			System.out.println("play2赢了");
		}
	}
}