import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TwoDimRaggedArrayUtility 
{

	//default constructor
	public TwoDimRaggedArrayUtility() 
	{
	}
	public static double [][] readFile(File file)throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		int numRows = 0;


		while (scan.hasNextLine()) {
			numRows++;
			scan.nextLine();
		}
		int row = 0;
		double[][] hold = new double[numRows][];
		scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] parts = line.split(" ");

			hold[row] = new double[parts.length];

			
			for (int col = 0; col < parts.length; col++) {
				hold[row][col] = Double.parseDouble(parts[col]); //converts string 
			}
			row++;
		}     
		scan.close(); 
		return hold;
	}
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(outputFile);
		StringBuilder datasale = new StringBuilder();
		for (int i = 0;i < data.length;i++) {
			for (int j = 0;j < data[i].length;j++) {
				datasale.append(data[i][j]+ " ");
			}
			datasale.append("\n");
		}
		writer.print(datasale.toString());
		writer.close();

	}
	public static double getTotal(double[][] data)
	{
		double total = 0.0;
		for (int i = 0; i < data.length; i++) 
		{
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];  //add all the values up
			}
		}
		return total;
	}

	public static double getAverage(double[][] data)
	{
		double total = 0.0;
		int num = 0;
		for (int i = 0;i < data.length;i++) {
			num += data[i].length; 
			for (int j = 0;j < data[i].length;j++) {
				total += data[i][j];
			}
		}
		return total / num;
	}
	//row totals
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0;

		for (int j = 0; j < data[row].length; j++) {
			rowTotal += data[row][j];
		}

		return rowTotal;
	}


	public static double getColumnTotal(double[][] data, int col) {
		double columnTotal = 0.0;

		if (col < 0 || col >= data[0].length) {

			return 0.0;
		}

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				columnTotal += data[row][col];
			}
		}

		return columnTotal;
	}
	public static double getHighestInRow(double[][] data, int row) {

		double highestRow = data[row][0]; 

		for (int col = 1; col < data[row].length; col++) {
			if (data[row][col] > highestRow) {
				highestRow = data[row][col];
			}
		}	
		if (row < 0 || row >= data.length || data[row].length == 0) {

			return 0.0;
		}
		return highestRow;
	}
	public static int getHighestInRowIndex(double[][] data, int row) 
	{
		int highIndex = 0;
		double highest = data[row][0]; 
		for (int col = 1; col < data[row].length; col++) 
		{
			if (data[row][col] > highest) 
			{
				highest = data[row][col];
				highIndex = col;
			}
		}
		return highIndex;
	}

	public static double getLowestInRow(double[][] data, int row) {


		double lowestRow = data[row][0]; 

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < lowestRow) {
				lowestRow = data[row][col];
			}
		}

		return lowestRow;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {
		int lowestIndex = 0;
		double low = data[row][0];

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < low) {
				low = data[row][col];
				lowestIndex = col;
			}
		}

		return lowestIndex;

	}
	public static double getHighestInColumn(double[][] data, int col)
	{
		if (col < 0) {

			return 0;
		}
		double highestCol = 0.0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] > highestCol) {
				highestCol = data[row][col];
			}
		}

		return highestCol;
	}
	public static int getHighestInColumnIndex(double[][] data, int col) {

		double highestCol = -99999.9999; // maybe to change 
		int highestIndex = -1; 

		if (col < 0 || col >= data[0].length) {

			return -1;
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] > highestCol) {
				highestCol = data[row][col];
				highestIndex = row;
			}
		}

		return highestIndex;
	}
	public static double getLowestInColumn(double[][] data, int col) {
	    double low = 999999; 
	    for (int i = 0; i < data.length; i++) 
	    {
	        if (col < data[i].length) {
	           
	            if (data[i][col] < low) {
	                low = data[i][col];
	            }
	        }
	    }
	    return low;
	}
	public static int getLowestInColumnIndex(double[][] data, int col) {
		if (col < 0 || col >= data[0].length) {
			return -1;
		}

		double lowestIndexCol = 999999;
		int indexCol= -1;

		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && data[i][col] < lowestIndexCol) {
				lowestIndexCol = data[i][col];
				lowestIndexCol = i;
			}
		}

		return indexCol;

	}public static double getHighestInArray(double[][] data) {

		double highestArray = data[0][0]; 
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] > highestArray) {
					highestArray = data[row][col];
				}
			}
		}

		return highestArray;


	}
	public static double getLowestInArray(double[][] data) {

		double lowestArray = data[0][0];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < lowestArray) {
					lowestArray = data[row][col];
				}
			}
		}

		return lowestArray;

	}
	
	}
