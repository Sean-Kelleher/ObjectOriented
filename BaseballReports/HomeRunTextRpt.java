import java.util.*;
import java.io.*;

public class HomeRunTextRpt 
{
	protected String m_dataFile;
	protected String m_reportFile;
	
	public HomeRunTextRpt(String dataFile, String reportFile)
	{
		this.m_dataFile = dataFile;
		this.m_reportFile = reportFile;
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
			if(!s[0].equals("") && !s[1].equals("") && s.length > 1)
				ret.add(new DataPair(s[0], Integer.parseInt(s[1])));
		}
		readIn.close();
		return ret;
	}
	public void generateReport(List<DataPair> data) throws FileNotFoundException
	{
		File outFile = new File(m_reportFile);
		PrintWriter out = new PrintWriter(outFile);
		String output = "";
		for(DataPair dp : data)
		{
			out.println(dp.getName() + " " + dp.getStat() + "\n");
		}
		out.close();
	}
	
}
