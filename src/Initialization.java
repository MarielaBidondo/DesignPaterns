

/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */


public class Initialization implements TradingAlertState{
//Abstraction implemente
	@Override
	public void tradingStatus(TradingAlertContext ctx) {
		System.out.println("Trading Day Initializing....................");
	}
}

