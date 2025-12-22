//public class VolatileExample {
//    public static void main(String[] args) throws InterruptedException {
//        Runner runner = new Runner();

//        Thread workerThread = new Thread(runner);
//        workerThread.start();
//
//        Thread.sleep(5000);
//
//        System.out.println("Main thread signalling runner to stop...");
//        runner.stopRunnig();
//
//        workerThread.join();
//    }
//}
