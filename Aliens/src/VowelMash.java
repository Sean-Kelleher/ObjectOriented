//A->E, E->I, I->O, O->U, U->A
public class VowelMash implements ICrypto
{
	private static VowelMash m_instance;
	
	public VowelMash(){};
	
	public static VowelMash getInstance()
	{
		if(m_instance == null)
		{
			m_instance = new VowelMash();
		}
		return m_instance;
	}
	 
	@Override
	public String decrypt(String message) 
	{
		IMessageParser mp = new MessageParser(message);
		String result = "";
		int cc = mp.getCharCount();
		for(int i =0; i < cc; i++)
		{			
			switch(mp.getChar(i)){
				case 'E' : result += "A";
							break;
				case 'I' : result += "E";
							break;
				case 'O' : result += "I";
							break;
				case 'U' : result += "O";
							break;
				case 'A' : result += "U";
							break;
				default : result += Character.toString(mp.getChar(i));
							break;
			}
		}
		return result;
	}
	@Override
	public String encrypt(String message) 
	{
		IMessageParser mp = new MessageParser(message);
		String result = "";
		int cc = mp.getCharCount();
		for(int i =0; i < cc; i++)
		{	
			switch(mp.getChar(i)){
				case 'A' : result += "E";
							break;
				case 'E' : result += "I";
							break;
				case 'I' : result += "O";
							break;
				case 'O' : result += "U";
							break;
				case 'U' : result += "A";
							break;
				default : result += Character.toString(mp.getChar(i));
							break;
			}
		}
		return result;
	}
	
	

}
