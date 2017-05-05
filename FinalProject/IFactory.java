import java.util.*;

public interface IFactory
{

  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY);
  public IGameView createMainView(List<IGameObject> objects);
  public IGameView createStatusView(List<IGameObject> objects);
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views);
  public IGameObject createEnemy1(int x, int y, int w, int h, int dX, int dY);
  public IGameObject createEnemy2(int x, int y, int w, int h, int dX, int dY);
}
