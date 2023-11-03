package JavaProgramming;

public class Book_P189 {
	String title;
	String author;
	
	public Book_P189(String t)//생성자
	{
		title = t;
		author = "작자미상";
	}

	public Book_P189(String t, String a)//생성자
	{
		title = t;
		author = a;
	}

	public static void main(String[] args)
	{
		Book_P189 littlePrince = new Book_P189("어린왕자", "생택쥐페리"); // 생성자 Book_P189(String t, String a)호출
		Book_P189 loveStory = new Book_P189("춘향전");	// 생성자 Book(String t) 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
