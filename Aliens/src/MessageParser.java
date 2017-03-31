import java.util.*;

public class MessageParser implements IMessageParser
{
	private ArrayList<String> m_words = new ArrayList<String>(); 
	private String m_message = "";     
	public MessageParser(String message) 
	{
		m_message = message;
		String[] words = m_message.split(" ");
		for(String s : words)
			m_words.add(s);
	}
	
	public int getCharCount()
	{
		String[] chars = m_message.split("");
		return chars.length;
	}
	public int getWordCount()
	{
		return m_words.size();
	}
	public char getChar(int i)
	{
		return m_message.charAt(i);
	}
	public String getWord(int i)
	{
		return m_words.get(i);
	}
	
}
