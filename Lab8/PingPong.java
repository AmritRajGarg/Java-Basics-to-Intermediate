/* WAP in Java to Implement the PingPong program using thread class extension
 Print as follows:
 Ping: 1/20th of a second 
 Pong:1/40th of a second */
class PingPong extends Thread {
    private String word;
    private int delay;

    public PingPong(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(word);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(word + " thread interrupted");
        }
    }

    public static void main(String[] args) {
        PingPong ping = new PingPong("Ping", 50);  // 1/20 sec = 50 ms
        PingPong pong = new PingPong("Pong", 25);  // 1/40 sec = 25 ms
        
        ping.start();
        pong.start();
    }
} 
