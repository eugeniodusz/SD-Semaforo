import java.util.concurrent.locks.*;

public class CarroLock extends Thread {
    private static Lock estacionamento = new ReentrantLock();

    public CarroLock(String nome) {
        super(nome);
    }

    public void run() {
        try {
            estacionamento.lock();
            System.out.println(getName() + " ocupou vaga.");
            sleep((long) (Math.random() * 10000)); // Simula o tempo de ocupação
            System.out.println(getName() + " liberou vaga.");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            estacionamento.unlock();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new CarroLock("Carro #" + i).start();
        }
    }
}
