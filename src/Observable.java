/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370 
 */

public interface Observable {
	
	 //methods to register and unregister observers
	public void registerObserver(StockMarketHandler observer);
	public void removeObserver(StockMarketHandler observer);
	 //method to notify observers of change
	public void notifyObservers();
	
	   //method to get updates from subject
    //public Object getUpdate();
}