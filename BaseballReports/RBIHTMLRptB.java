import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class RBIHTMLRptB extends RBITextRpt  
{
	public RBIHTMLRptB(String dataFile, String reportFile)
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
