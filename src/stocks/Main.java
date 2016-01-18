package stocks;

import java.io.IOException;
import java.util.List;

public class Main {

	public Main() {
		// Create new Stock Market
		StockMarket stock = new StockMarket();

		// Add Stocks To Market
		try {
			stock.addStockToMarket("Kitty", 14.00);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> info = stock.connectToStock("Kitty");
		for (String lines : info) {
			System.out.println(lines);
		}
	}

	public static void main(String[] args) {
		// New Main
		Main main = new Main();
	}
}
