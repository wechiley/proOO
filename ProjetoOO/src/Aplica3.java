public class Aplica3 {

    public static void main(String[] args) {

        Endereco end1 = new Endereco("123451-01", "Duque de Caxias ", "Rua Cariana", "Casa", "RJ", "10");

        Cliente clin1 = new Cliente("111.222.333-04", "Pedrinho", "998184524");
        clin1.listaEndereco.add(end1);
//---------------------------------------------saques e depósitos---------------------------------------------------------------------
        ContaCorrente cc1 = new ContaCorrente("107", 0., 0.);

        Credito cred1 = new Credito(100.00);
        Credito cred2 = new Credito(100.00);
        Credito cred3 = new Credito(100.00);
        cc1.credito.add(cred1);
        cc1.credito.add(cred2);
        cc1.credito.add(cred3);


        Debito debi1 = new Debito(50.);
        cc1.debito.add(debi1);

        cc1.depositar(cred1);
        cc1.depositar(cred2);
        cc1.depositar(cred3);

        cc1.sacar(debi1);


        System.out.println("Conta numero: " + cc1.getNumero() + " tem o Saldo de: " + cc1.calcularSaldo(cc1));

    }
}
