//这个例子是写石头剪刀布的a石头，b剪刀，c布
public class Test02{
	public static void main(String args []){
		char play1 = 'a';
		char play2 ='b';
		if(play1 == 'a' && play2 == 'a') {
			System.out.println('平');
		}
		else if(play1 == 'a' && play2 == 'b'){
			System.out.println("play1玩家赢了");
		}
		else if(play1 == 'a' && play2 == 'c'){
			System.out.println("play2玩家赢了");
		}
		else if(play1 == 'b' && play2 == 'a'){
			System.out.println("play2玩家赢了");
		}
		else if(play1 == 'b' && play2 == 'b'){
			System.out.println("平了");
		}
		else if(play1 == 'b' && play2 == 'c'){
			System.out.println("play2玩家赢了");
		}
		else if(play1 == 'c' && play2 == 'a'){
			System.out.println("play1玩家赢了");
		}
		else if(play1 == 'c' && play2 == 'b'){
			System.out.println("play2玩家赢了");
		}
		else if(play1 == 'c' && play2 == 'c'){
			System.out.println("平了");
		}
	}
}