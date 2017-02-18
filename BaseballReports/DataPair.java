public class DataPair
{
	private String m_name;
	private int m_stat;
	
	public DataPair(String name, int stat)
	{
		this.m_name = name;
		this.m_stat = stat; 
	}
	public String getName()
	{
		return m_name;
	}
	public int getStat()
	{
		return m_stat;
	}
}
