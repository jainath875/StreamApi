//public class Runner implements Runnable{
//
//    private volatile boolean running = true;
//
//    @Override
//    public void run() {
//        while(running) {
//            System.out.println("Runner is Working");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//
//        System.out.println("Runner has stopped.");
//    }
//
//    public void stopRunnig() {
//        running = false;
//    }
//
//}
