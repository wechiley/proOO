public class Aplica4 {

    public static void main(String[] args) {

        Endereco end1 = new Endereco("123451-01", "Duque de Caxias ", "Rua Cariana", "Casa", "RJ", "10");

        Cliente clin1 = new Cliente("111.333.666-04", "Jao", "998119198");
        clin1.listaEndereco.add(end1);

        ContaCorrente cc1 = new ContaCorrente("182", 10.0, 0.0);
        ContaPoupanca cp1 = new ContaPoupanca("546", 10.0, 0.01);


//conta corrente cima//


        Credito cred = new Credito(1000.00);
        Credito cred2 = new Credito(1000.00);

        cc1.depositar(cred);
        cc1.credito.add(cred);

        cp1.depositar(cred2);
        cp1.credito.add(cred2);


        cc1.trasferir(cc1, cp1, 500.);
        //impressao==============================
        System.out.println("Conta numero: " + cc1.getNumero() + " tem o Saldo de: " + cc1.getValorCaixa());
        System.out.println("Conta numero: " + cp1.getNumero() + " tem o Saldo de: " + cp1.getValorCaixa());


    }
}
