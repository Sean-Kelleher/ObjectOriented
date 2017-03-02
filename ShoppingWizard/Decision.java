import java.util.Scanner;

public class Decision implements IDecision 
{
	private String m_question;
	private IDecision m_yes;
	private IDecision m_no;
	private String m_yesTerminal;
	private String m_noTerminal;
	
	public Decision(String question)
	{
		m_question = question;
	}
	@Override
	public void setYes(IDecision yes) 
	{
		m_yes = yes;
	}
	@Override
	public void setNo(IDecision no) 
	{
		m_no = no;
	}
	@Override
	public void setNoTerminal(String terminal) 
	{
		m_noTerminal = terminal;
	}
	@Override
	public void setYesTerminal(String terminal)
	{
		m_yesTerminal = terminal;
	}
	@Override
	public IDecision ask()
	{
		Scanner in = new Scanner(System.in);
		IDecision ret = null;
		System.out.println(m_question);
		String decide = in.nextLine();
		
		if(decide.equalsIgnoreCase("no") || decide.equalsIgnoreCase("n"))
		{
			if(m_noTerminal == null)
				ret = m_no;
			else
				System.out.println(m_noTerminal);			
		}
		if(decide.equalsIgnoreCase("yes") || decide.equalsIgnoreCase("y"))
		{	
			if(m_yesTerminal == null)
				ret = m_yes;
			else
				System.out.println(m_yesTerminal);
		}
	
		return ret;
	}
}