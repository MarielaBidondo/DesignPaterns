import java.util.List;
/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */
//https://www.cs.colorado.edu/~kena/classes/5448/s11/lectures/26_patternsofpatterns.pdf

public interface StockMarketHandler {
	//interface Observer
	//public void update
	   //method to update the observer, used by subject
	 int updateInitial(List<?> list);

	 int updateCurrent(List<?> list);
	 
	 void update(Investor investor);

	 void update(Company company);
	//attach with subject to observe
	 public void elementDetails(Observable obser);
	 
	
 
}