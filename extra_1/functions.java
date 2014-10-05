package extra_1;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class functions {
// contains functions being used by this package
	
	public static boolean isPrime(int checkInt)
	{
		boolean found = false;
		int i = checkInt -1;
		
		
		while (!found && i > 1)
		{
			if (checkInt % i == 0)
			{
				found = true;
			}	
			i--;
		}
		
		return !found;
	}
	
	public static String[]  openFile(String path) throws IOException
	
	{
		// taken from http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = countLines(path);
		String[] textData = new String[numberOfLines];
		
		int i;
		
		for (i=0; i< numberOfLines; i++)
		{
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
	public static int countLines(String path) throws IOException
	{
		// taken from http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int numberOfLines = 0;
		
		while (( line = br.readLine()) != null)
		{
			numberOfLines++;
		}
		br.close();
		
		return numberOfLines;
		
	}
	
	
	
	public static void main(String[] args) {

		
	}
}
