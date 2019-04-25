

/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370 
 */

public interface Observer{
	
    //method to update the observer, used by subject
    public void update(Company shares);
    //public void update(Stock stock);
    //attach with subject to observe
//    public void setSubject(Subject sub);   
 //   int initialShares = comp.updateInitial(companies);
//	int soldShare = comp.updateCurrent(companies);
//	int investorTotalBudget = inv.updateCurrent(investors);
}
