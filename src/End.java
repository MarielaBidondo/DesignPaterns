
/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */


public class End implements TradingAlertState {

	@Override
	public void tradingStatus(TradingAlertContext ctx) {
		System.out.println("Trading day end..........................");
	}
}

