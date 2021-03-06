public class StopwatchThread implements Runnable{

    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName){
        this.threadName = threadName;
        System.out.println ( "Creating " + threadName );
    }

    @Override
    public void run() {
        System.out.println ( "Working " + threadName  );

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println (threadName + " : " + i);
                Thread.sleep (1000);
            }
        } catch (InterruptedException exception) {
               System.out.println ( "Interrupt : " + threadName );
            }
        System.out.println ( "Thread ended : " + threadName );
        // thread.run ();
    }

    public void start(){
        System.out.println ( "Thread object creating" );
        if (thread == null) {

            thread = new Thread ( this, threadName );
            thread.start ();
        }
    }
}
