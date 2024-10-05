package ExemploConta;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Cliente t1 = new Cliente("Vinicius");
        Conta c1 = new Conta(t1);
    
        Cliente t2 = new Cliente("Adriano");
        Conta c2 = new Conta(t2);
    
        Cliente t3 = new Cliente("Felipe");
        Conta c3 = new Conta(t3);

        c1.depositar(100);
        // Thread.sleep(2000);
        c1.depositar(200);
        // Thread.sleep(3000);
        c1.sacar(50);

        c1.historico();
        System.out.println(c1.saldo());
        
    
        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(c3);
    }

}
