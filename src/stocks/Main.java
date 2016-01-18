package stocks;

import java.io.IOException;

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

		// Get Stock by Name
		String info = stock.connectToStock("Kitty");
		System.out.println(info);
	}

	public static void main(String[] args) {
		// New Main
		Main main = new Main();
	}
}
