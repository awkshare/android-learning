public class Test04 {
	private String name;
	private int age;
	String country;
	public Test04(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getInfo() {
		return "姓名： " + this.name + ", 年龄：" + this.age + ",城市：";
	}
}
public class TestDemo {
	public static void main(String args[]) {
		Person per1 = new Person("张三",20);
		Person per2 = new Person("李四",21);
		Person per3 = new Person("王五",22);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}