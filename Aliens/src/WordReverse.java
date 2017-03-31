
public class WordReverse implements ICrypto
{
	private static WordReverse m_instance;
	
	private WordReverse(){};
	
	public static WordReverse getInstance()
	{
		if(m_instance == null)
			m_instance = new WordReverse();
		return m_instance;
	}

	@Override
	public String encrypt(String message) 
	{
		IMessageParser mp = new MessageParser(message);
		int wc = mp.getWordCount();
		String result = "";
		for(int i = 0; i < wc; i++)
		{
			for(int j =  mp.getWord(i).length(); j > 0; j--)
			{
				result += Character.toString(mp.getWord(i).charAt(j));
			}
			result += " ";
		}
		return result;
	}

	@Override
	public String decrypt(String message) 
	{
		IMessageParser mp = new MessageParser(message);
		int wc = mp.getWordCount();
		String result = "";
		for(int i = 0; i < wc; i++)
		{
			for(int j =  mp.getWord(i).length()-1; j >= 0; j--)
			{
				result += Character.toString(mp.getWord(i).charAt(j));
			}
			result += " ";
		}
		return result;
	}

}
