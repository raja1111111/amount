package amount;

	

import java.util.ArrayList;

public class shop {

	public int price =0;
	public int count=0;
	
	public static ArrayList<Integer>book=new ArrayList<Integer>();
	
	public void addbook(int p) {
		book.add(p);
		count=book.size();
		price = price+p;
		
		
	}

}


