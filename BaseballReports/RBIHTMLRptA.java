import java.io.File;
import java.io.IOException;
import java.util.*;

public class RBIHTMLRptA extends HomeRunHTMLRpt  
{
	public RBIHTMLRptA(String dataFile, String reportFile)
	{
		super(dataFile, reportFile);
	}
	public List<DataPair> loadData() throws IOException
	{
		ArrayList<DataPair> ret = new ArrayList<DataPair>();
		File inFile = new File(m_dataFile);
		Scanner readIn = new Scanner(inFile);
		while(readIn.hasNextLine())
		{
			//creates an array of [name, homeruns, RBI]
			String[] s = readIn.nextLine().split(",");			
			if(s.length>2 && !s[0].equals("") && !s[2].trim().equals(""))			
				ret.add(new DataPair(s[0], Integer.parseInt(s[2].trim())));
		}
		readIn.close();
		return ret;
	}
}
