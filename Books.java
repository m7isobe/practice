public class Books extends TangibleAsset{
	private String isbn;
	public Books(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbn(){return this.Isbn}
}
