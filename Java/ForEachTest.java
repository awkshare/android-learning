public class ForEachTest{
	public static void main(String[] args){
		String[] books = {"������Java EE��ҵӦ��ʵս",
			"���Java����",
			"���android����"
		};
		for (String book : books){
			book = "���ajax����";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}
