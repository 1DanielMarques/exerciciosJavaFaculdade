package ex11;



public class Life {
    public static void main(String[] args) {
        Dev dev = new Dev("Software Engineer");
        while (dev.alive()) {
            if (dev.awake()) {
                dev.coffee();
                dev.study();
                dev.code();
                dev.sleep();
            } else {
                dev.wakeUp();
                System.out.println("Let's start!");
            }
        }
    }
}
