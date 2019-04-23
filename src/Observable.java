/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370 
 */

public interface Observable {
	
	public void registerObserver(TradingAlertState observer);
	public void notifyObservers();
	public void removeObserver(TradingAlertState observer);
	
}