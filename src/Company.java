import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */


public class Company implements Observable{

	private String id;
	private int shares;
	private int shareValue;

	private int soldShares;
	private int capital;
	
	private List<StockMarketHandler> observers = new ArrayList<>();
	//Company constructor
	private Company(String id,int shares,int shareValue){
		this.id = id;
		this.shares = shares;
		this.shareValue = shareValue;
	}
    //Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getShareValue() {
		return shareValue;
	}

	public void setShareValue(int shareValue) {
		this.shareValue = shareValue;
	}

	public int getSoldShares() {
		return soldShares;
	}

	public void setSoldShares(int soldShares) {
		this.soldShares = soldShares;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	/* Using Builder Design pattern to which is creational pattern force
	 * us to create an object by injecting the parameters that we want. without providing those parameters
	 * user cant create object of that class
	 */
	public static class CompanyBuilder{
		private String id;
		private int shares;
		private int shareValue;

		public CompanyBuilder setId(String id){
			this.id = id;
			return this;
		}

		public CompanyBuilder setShares(int shares){
			this.shares = shares;
			return this;
		}

		public CompanyBuilder setShareValue(int shareValue){
			this.shareValue = shareValue;
			return this;
		}
       //public builder
		public Company build(){
			return new Company(id,shares,shareValue);
		}
	}

	
	 // @Override 
	  public int updateInitial(List<?> list) { List<Company> companies =
	  (List<Company>) list; int initialShares = companies.stream().mapToInt(value
	  -> value.getShares()).sum(); 
	  this.notifyObservers(); 
	  return initialShares;
	  }
	 
//	@Override
	public int updateCurrent(List<?> list) {
		List<Company> companies = (List<Company>) list;
		int soldShares = companies.stream().mapToInt(value -> value.getSoldShares()).sum();
		this.notifyObservers();
		return soldShares;	
	}
//
//	@Override
	public void elementDetails(Object obj) {
		System.out.println("Company ID:"+id+"  "+"Shares"+shares);
	}
//
//	public void registerObserver(StockMarketHandler observer) {
//		if(observer != null){
//			this.observers.add(observer);
//		}
//	}
	@Override
	public void removeObserver(StockMarketHandler observer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registerObserver(StockMarketHandler observer) {
		// TODO Auto-generated method stub
		
	}



//	@Override
//	public void notifyObservers() {
//		Iterator<StockMarketHandler> it = observers.iterator();
//		while(it.hasNext()){
//			StockMarketHandler observer = it.next();
//			observer.update(this);
//		}
//	}
//
//	@Override
//	public void removeObserver(StockMarketHandler observer) {
//		if(observer != null){
//			this.observers.remove(observer);
//		}
//	}
	
}
