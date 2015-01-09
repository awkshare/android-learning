class Singleton {
	public void print() {
		System.out.println("Hello World .");
		}
}

public class Test06 {
	public static void main(String args[]) {
		Singleton inst = null;
		inst  = new Singleton();
		inst.print();
	}
}
