package stocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StockMarket {

	String information;
	String errorMessage = "Cannot Get Stock File!";

	public StockMarket() {
	}

	/** Adds Stock To Market (Based on name and start amount) **/
	public void addStockToMarket(String name, double startAmount) throws IOException {
		try {
			// PrintWriter
			PrintWriter writer;

			// Initialize PrintWriter
			writer = new PrintWriter(name + ".txt", "UTF-8");

			// Print Lines
			writer.println("Stock: " + name);
			writer.println("Start Amount: " + startAmount);

			// Close PrintWriter
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read stock information from player's stock choice and initialize game
	 * from it
	 **/
	public String connectToStock(String stockName) {
		// Connect to Folder
		File folder = new File("D:/Albert/Java Programming/Stock Market/Stock Market");

		// Get Files inside Folder and put it into a list of files
		File[] list = folder.listFiles();

		// Loop through list of files
		for (int i = 0; i < list.length; i++) {

			// Get name of each file
			String fileName = list[i].getName();

			// If File starts with stock Name, then loop and print the contents
			// of the file
			if (fileName.startsWith(stockName)) {
				try {
					FileReader reader = new FileReader(fileName);
					BufferedReader breader = new BufferedReader(reader);

					try {
						int count = 0;
						String line = null;
						while ((line = breader.readLine()) != null) {
							count++;
							return line
						}
						// Close BufferedReader
						breader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return errorMessage;
	}
}
