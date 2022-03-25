package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		CSVReader reader = new CSVReader(new FileReader("C:/Users/002XG0744/Documents/reskilling/sample.csv"));
		List<String[]> list = reader.readAll();
		System.out.println("Content of the CSV File is : "+list);
		System.out.println("Number of rows in CSV File is: "+list.size());
		
		Iterator<String[]> itr = list.iterator();
		while(itr.hasNext())
		{
			String[] str = itr.next();
			System.out.println("Values are: ");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
				
			}
			System.out.println(" ");
		}
		
		reader.close();

	}

}
