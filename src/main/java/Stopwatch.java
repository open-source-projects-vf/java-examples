/**
 A class to measure time elapsed.
*/

public class Stopwatch
{
    private long startTime;
    private long stopTime;
	private long unusedVariable;
    private long dd;
    private long ds;
    private long starte3Time;
    private long stop3Time;
    private long sta2rtTime;
    private long sto2rtpTime;

    public static final double NANOS_PER_SEC = 1000000000.0;

	/**
	 start the stop watch.
	*/
	public void start(){
		System.out.println("start()");
		startTime = System.nanoTime();
	}

	/**
	 stop the stop watch.
	*/
	public void stop(){	
		System.out.println("stop()");
		stopTime = System.nanoTime();	
	}

	/**
	elapsed time in seconds.
	@return the time recorded on the stopwatch in seconds
	*/
	public double time()
	{	return (stopTime - startTime) / NANOS_PER_SEC;	}

	public String toString(){
	    return "elapsed time: " + time() + " seconds.";
	}

	/**
	elapsed time in nanoseconds.
	@return the time recorded on the stopwatch in nanoseconds
	*/
	public long timeInNanoseconds()
	{	return (stopTime - startTime);	}
}

