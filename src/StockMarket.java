
import java.util.ArrayList;
import java.util.List;


/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */

public class StockMarket implements StockMarketHandler {
	//implements observer
	
	private List<Company> companies = new ArrayList<>();
	private List<Investor> investors = new ArrayList<>();

	@Override
	public int updateInitial(List<?> list) {
		return 0;
	}

	@Override
	public int updateCurrent(List<?> list) {
		return 0;
	}

	/*we can call this element details method at any time to get the updated list of investors and companies*/
	@Override
	public void elementDetails(Observable observ) {

		if(observ.getClass().equals(Company.class)){       /* Composite Design pattern is using to print all details of Companies (no sure  why is no observer)??? */
			for(Company c:companies){		   		   /* at a particular time */
				c.elementDetails(observ);
			}
		}else if(observ.getClass().equals(Investor.class)){    /* Composite Design pattern is using to print all details of Investors  */
			for(Investor i:investors){					   /* at a particular time */
				i.elementDetails(observ);
			}
		}
	}
	
	@Override
	public void update(Investor investor) {
		System.out.println("DISPLAYBOARD - The Price of "+investor.getId()+" has changed:"+investor.getOwnShares());	
	}

	@Override
	public void update(Company companies) {
		System.out.println("DISPLAYBOARD - The Price of "+ companies.getId()+" has changed:"+ companies.getShareValue());
		
	}

	public List<Company> addCompanies(){
		for (int i = 0; i < 100; i++) { /* creating random companies*/
			Company company = new Company.CompanyBuilder().setId("COM " + (i + 1))
					.setShares((int) (Math.random() * (1000 - 500) + 500))
					.setShareValue((int) (Math.random() * (100 - 10) + 10)).build();
			companies.add(company);
		}
		return companies;
	}

	public List<Investor> addInvestors(){
		for (int i = 0; i < 100; i++) { /*creating random investors*/
			Investor c = new Investor.InvestorBuilder().setId("INV" + (i + 1))
					.setBudjet((int) (Math.random() * (10000 - 1000) + 1000)).build();
			investors.add(c);
		}
		return investors;
	}

}
