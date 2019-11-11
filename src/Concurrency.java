public class Concurrency implements Runnable {
    @Override
    public void run() {
        //비동기 작업 처리
    }

    // 비동기 처리 시작
    public static void main(String[] args) {
        Thread thread = new Thread(new Concurrency());
        thread.setDaemon(true);
        thread.start();
    }
}