/* WAP in Java:  

•	Implement the PingPong program using runnable
•	In one second, approximately print 
o	2 ping
o	1 pong
*/
 
class  implements Runnable {
    private String word;
    private int count;
    
    public PingPongRunnable(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(word);
                Thread.sleep(500);  // 2 pings per second, 1 pong per second
            }
        } catch (InterruptedException e) {
            System.out.println(word + " interrupted");
        }
    }
    
    public static void main(String[] args) {
        Thread ping = new Thread(new PingPongRunnable("Ping", 2));
        Thread pong = new Thread(new PingPongRunnable("Pong", 1));

        ping.start();
        pong.start();
    }
}
