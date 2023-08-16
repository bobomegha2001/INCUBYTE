package Test;
import programFuction.Spacecraft;
import programFuction. GalacticCoordinates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Chandrayaan3 {

    @Test
  public void TestgetCurrentPosition(){
    GalacticCoordinates initialCoordinates = new GalacticCoordinates(0, 0, 0);
    char initialDirection = 'N';
    Spacecraft sp=new Spacecraft( initialCoordinates , initialDirection);
    char[] commands = {'f', 'r', 'u', 'b', 'l'};
    sp.executeCommands(commands);
    sp.getCurrentPosition();
    assertEquals("Position: (0, 1, -1)" , sp.getCurrentPosition());



  }
  @Test
   public void TestgetCurrentDirection(){
    GalacticCoordinates initialCoordinates = new GalacticCoordinates(0, 0, 0);
    char initialDirection = 'N';
    Spacecraft sp=new Spacecraft( initialCoordinates , initialDirection);
    char[] commands = {'f', 'r', 'u', 'b', 'l'};
    sp.executeCommands(commands);
      assertEquals("direction:N", sp.getCurrentDirection());




  }
}

   