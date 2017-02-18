import java.util.*;
import java.io.*;

public class HomeRunHTMLRpt extends HomeRunTextRpt 
{

	public HomeRunHTMLRpt(String dataFile, String reportFile) 
	{
		super(dataFile, reportFile);
	 
	}
	public void generateReport(List<DataPair> data) throws FileNotFoundException
	{
		File outFile = new File(m_reportFile);
		PrintWriter out = new PrintWriter(outFile);
		out.println("<html>"+System.lineSeparator() + "<body>"+System.lineSeparator() + "<table>");
		for(DataPair dp : data)
		{
			out.println("<tr><td>" + dp.getName() + "</td><td>" + dp.getStat() + "</td></tr> \n");
		}
		out.println("</table>"+System.lineSeparator() + "</body>"+System.lineSeparator() + "</html>");
		
	}
	
}
