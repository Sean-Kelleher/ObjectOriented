
public class Factory 
{
	private static Factory m_instance;
	
	public Factory(){};
	
	public static Factory get_instance()
	{
		if(m_instance == null)
			m_instance = new Factory();
		return m_instance;
	}
	public IMessageParser createParser(String text)
	{
		IMessageParser mp = new MessageParser(text);
		return mp;
	}

}
