public class AnonymousThreads {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable - Classe Anônima");
            }
        }).start();
    };

}
