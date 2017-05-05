import java.io.File;
import java.util.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  @Override
  public IGameObject createEnemy1(int x, int y, int w, int h, int dX, int dY)
  {
	  String mon1 = "";
	  try 
      {
		  int i = 0;
          
          String[] mons = new String[3];
          Scanner f = new Scanner(new File("./behavior.txt"));
          while(f.hasNextLine())
          {
              mons[i] = f.nextLine().trim();
              i++;
          }
          mon1 = mons[0] + ".png";
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Monster instance");
      }
	  if(mon1.equals("monster1.png"))
		  return new Monster1(mon1, x, y, w, h, dX, dY);
	  if(mon1.equals("monster2.png"))
		  return new Monster2(mon1, x, y, w, h, dX, dY);
	  if(mon1.equals("monster3.png"))
		  return new Monster3(mon1, x, y, w, h, dX, dY);
	  else
		  return new Monster4(mon1, x, y, w, h, dX, dY);
  }
  
  public IGameObject createEnemy2(int x, int y, int w, int h, int dX, int dY)
  {
	  String mon2 = "";
	  try 
      {
		  int i = 0;
          
          String[] mons = new String[3];
          Scanner f = new Scanner(new File("./behavior.txt"));
          while(f.hasNextLine())
          {
              mons[i] = f.nextLine().trim();
              i++;
          }
          mon2 = mons[1] + ".png";
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Monster instance");
      }
	  if(mon2.equals("monster1.png"))
		  return new Monster1(mon2, x, y, w, h, dX, dY);
	  if(mon2.equals("monster2.png"))
		  return new Monster2(mon2, x, y, w, h, dX, dY);
	  if(mon2.equals("monster3.png"))
		  return new Monster3(mon2, x, y, w, h, dX, dY);
	  else
		  return new Monster4(mon2, x, y, w, h, dX, dY);
  }


  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY)
  {
	  String dude = "";
	  try 
      {
		  int i = 0;
          
          String[] mons = new String[3];
          Scanner f = new Scanner(new File("./behavior.txt"));
          while(f.hasNextLine())
          {
              mons[i] = f.nextLine().trim();
              i++;
          }
          dude = mons[2] + ".png";
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Hero instance");
      }
    return new Hero(dude, x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
