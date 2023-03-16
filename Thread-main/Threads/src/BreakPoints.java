public class BreakPoints {
    Runnable breakPoint = () -> {
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Break Point");
        }
    };
}
