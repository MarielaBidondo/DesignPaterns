import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */


public class TradingAlertContext {
	
	private TradingAlertState currentAlertState;
	

	public TradingAlertContext(){
		currentAlertState = new Initialization();
	}

	public void setState(TradingAlertState state){
		currentAlertState = state;
	}

	public void status(){
		currentAlertState.tradingStatus(this);
	}
	
	
}