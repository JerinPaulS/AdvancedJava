package concurrency.locks;

public class SyncCounter {

    private int count;

    /** Implicit lock */
    public synchronized void increment() {
        count++;
    }

//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }

    public synchronized int getCount() {
        return count;
    }

}
