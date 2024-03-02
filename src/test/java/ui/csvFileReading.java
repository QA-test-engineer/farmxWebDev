package ui;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.Test;

public class csvFileReading {

	@Test
	public void readCSV() throws IOException {
		String path = "C:\\Users\\User\\Documents\\DemoFile.csv";

		// Create a new BufferReader object and pass the path of CSV file
		Reader reader = Files.newBufferedReader(Paths.get(path));

		// parse the file into csv values
		CSVParser parse = new CSVParser(reader, CSVFormat.DEFAULT);

		for (CSVRecord csvRecord : parse) {

			// Accessing Values by Column Index
			String firstname = csvRecord.get(0);
			String lastName = csvRecord.get(1);
			String company = csvRecord.get(2);
			
			System.out.println("---------------------------------");
			System.out.println("Record No - " + csvRecord.getRecordNumber());
			System.out.println("FirstName : " + firstname);
			System.out.println("Last Name : " + lastName);
			System.out.println("Company name : " + company);
			
		}
	}

}
