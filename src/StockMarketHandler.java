import java.util.List;
/**
 * @author Mariela Bidondo 2016252
 * @author Leticia Sessa 2016370
 */

public interface StockMarketHandler {
	//Abstraction implemented OOP

	 int updateInitial(List<?> list);

	 int updateCurrent(List<?> list);

	 void elementDetails(Object obj);
}