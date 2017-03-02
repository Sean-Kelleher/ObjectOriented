
public class Builder 
{
	private static Builder m_instance;
	
	public IDecision buildWizard()
	{
		String XG200 = "Buy the XG200 model.";
		String XG100 = "Buy the XG100 model.";
		String XG300 = "Buy the XG300 model.";
		String ZR100 = "Buy the ZR100 model.";
		String ZR200 = "Buy the ZR200 model.";
		String ZR300 = "Buy the ZR300 model.";

		IDecision jump = new Decision("Do you like to jump?");
		jump.setYesTerminal(ZR300);
		jump.setNoTerminal(ZR200);
		IDecision skiExpert = new Decision("Are you an expert?");
		skiExpert.setNoTerminal(ZR200);
		skiExpert.setYes(jump);
		IDecision skiBefore = new Decision("Have you gone skiing before?");
		skiBefore.setNoTerminal(ZR100);
		skiBefore.setYes(skiExpert);
		IDecision wantSkis = new Decision("Do you want to buy downhill skis?");
		wantSkis.setNoTerminal("Try skiing someday.");
		wantSkis.setYes(skiBefore);
		IDecision goFast = new Decision("Do you like to go fast?");
		goFast.setYesTerminal(XG300);
		goFast.setNoTerminal(XG200);
		IDecision boardExpert = new Decision("Are you an expert?");
		boardExpert.setNoTerminal(XG200);
		boardExpert.setYes(goFast);
		IDecision boardBefore = new Decision("Have you snowboarded before?");
		boardBefore.setNoTerminal(XG100);
		boardBefore.setYes(boardExpert);
		IDecision start = new Decision("Do you want to buy a snowboard?");
		start.setYes(boardBefore);
		start.setNo(wantSkis);
		
		return start;
	}
	private Builder(){};
	
	public static Builder getInstance()
	{
		if(m_instance == null)
			m_instance = new Builder();
		return m_instance;
	}

}
