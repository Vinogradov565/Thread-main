public class  Main {
    public static void main(String[] args) throws InterruptedException {
        DataLoader dataLoader = new DataLoader();
        BreakPoints breakPoints = new BreakPoints();

        Thread thread = new Thread(dataLoader.load);
        Thread secondThread = new Thread(breakPoints.breakPoint);

        thread.start();
        secondThread.start();
        thread.join();

        dataLoader.showResults();
    }
}