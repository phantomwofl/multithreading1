public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        final MyThread thread1 = new MyThread(mainGroup, "Поток 1");
        final MyThread thread2 = new MyThread(mainGroup, "Поток 2");
        final MyThread thread3 = new MyThread(mainGroup, "Поток 3");
        final MyThread thread4 = new MyThread(mainGroup, "Поток 4");


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        mainGroup.interrupt();


    }
}
