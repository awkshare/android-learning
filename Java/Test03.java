//这个例子从1循环打印到100后，再打印循环语句结束
//在类中定义一个主函数，使用for循环遍历0到99的整数并且打印出来
public class Test03{
	public static void main(String args []){
		for(int a = 0; a < 100; a++){
			System.out.println(a);
		}
		System.out.println("循环语句结束");
	}
}