import java.io.Serializable;
import java.util.ArrayList;

//library that allows to create a list
import java.util.List;

public class MainLibrary implements Serializable{

	// this private List object will take the list from the other class BookRecord
	private List<BookRecord> bookAccumulation;
	public MainLibrary() 
		{
			bookAccumulation = new ArrayList<BookRecord>();
		}
	
	
	//function method that adds the list of book
	public void appendsBook(BookRecord book)
		{
		//calling add function
			bookAccumulation.add(book);
		}
	
	//method that returns and displays all the books collected from the user
	public String CollectedBooks()
	{
		String display = "\n";
		// for loop that iterates through each of the book from the list
		for(int i = 0; i<bookAccumulation.size(); i++)
		{
			//object count that gets each book from the position i
			BookRecord count = bookAccumulation.get(i);
                                     //method from the other class "BookRecord"			
			display = display+ count.stringreturner();
		}
		return display;
	}
}