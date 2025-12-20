package thread;

public class Main {
    public static void main(String[] args) {
        // MyThread1 myThread1 = new MyThread1();
        // Thread thread = new Thread(myThread1);
        // thread.start();

        // for (int i = 0; i < 20; i++) {
        //     System.out.println("Main Thread: " + i);
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        // MyThread2 myThread2 = new MyThread2();
        // myThread2.start();

        // Runnable myRunnable = new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 20; i++) {
        //             System.out.println("Anonymous Runnable: " + i);
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        // Thread thread = new Thread(myRunnable);
        // thread.start();

        Runnable myLambdaRunnable = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Lambda Runnable: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(myLambdaRunnable);
        thread.start();

    }
}
