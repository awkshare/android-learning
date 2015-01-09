class TestDemo {
	private String name;
	private int age;
	String country;
	public TestDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getInfo() {
		return "姓名：" + this.name + ", 年龄：" + this.age + ",城市：" + this.country;
	}
}
public class Test05 {
	public static void main(String args[]) {
		Test05 per1 = new Test05("张三",20);
		Test05 per2 = new Test05("李四",21);
		Test05 per3 = new Test05("王五",22);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}