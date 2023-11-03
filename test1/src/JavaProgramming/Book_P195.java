package JavaProgramming;

public class Book_P195 {
	String title;
	String author;
	
	void show()
	{
		System.out.print(title + " " + author);
	}
	
	public Book_P195()
	{
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book_P195(String title) 
	{
		this(title, "작자미상");
	}

	public Book_P195(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) 
	{
		Book_P195 littlePrince = new Book_P195("어린왕자", "생텍쥐페리");
		Book_P195 loveStory = new Book_P195("춘향전");
		Book_P195 emptyBook = new Book_P195();
		loveStory.show();
	}
}
