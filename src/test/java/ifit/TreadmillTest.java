package ifit;

import org.junit.Assert;
import org.junit.Test;

public class TreadmillTest extends Assert
{
	 @Test
	  public void workouitSetSpeedAndIncline() throws Exception
	  {
	    Treadmill treadmill = new Treadmill();
	    boolean done = false;
	    float speed = 3.4f;
	    float lowInc = 1.5f;
	    float highInc = lowInc + 7.0f;
	    while( true ) {
	        treadmill.set(lowInc, speed);
	        Thread.sleep( 1000 * 60 * 2 );
	        treadmill.set(highInc, speed);
	        Thread.sleep(1000 * 60 * 1);
	        if( done ) {
	        	break;
	        }
	    }
	    treadmill.shutdown();
	  }

	
	@Test
  public void keepSetSpeedAndIncline() throws Exception
  {
    Treadmill treadmill = new Treadmill();
    boolean fast = false;
    boolean done = false;
    while( true ) {
        treadmill.set(2.0f, fast ? 1.0f : 2.0f);
        fast = !fast;
        Thread.sleep( 2000 );
        if( done ) {
        	break;
        }
    }
    treadmill.shutdown();
  }

  @Test
  public void shouldSetSpeedAndIncline() throws Exception
  {
    Treadmill treadmill = new Treadmill();
    treadmill.set(2.0f, 1.0f);
    treadmill.shutdown();
  }

  @Test
  public void shouldStop() throws Exception
  {
    Treadmill treadmill = new Treadmill();
    treadmill.stop();
    treadmill.shutdown();
  }
}
