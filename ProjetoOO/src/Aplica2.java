public class Aplica2 {
    public static void main(String[] args) {

        Cliente ct1 = new Cliente("158.879.187-79", "Evy", "1188153852");
        Endereco end1 = new Endereco("58549499", "Era", "Suzana", "ap", "Vero", "89");
        Endereco end2 = new Endereco("64949846", "nova", "marina", "casa", "Vero", "89");
        Endereco end3 = new Endereco("87458612", "velha", "alitana", "loja", "Cidade alta", "84");

        ct1.listaEndereco.add(end1);
        ct1.listaEndereco.add(end2);
        ct1.listaEndereco.add(end3);

        ct1.imprimirEndereco(ct1);

    }
}
