public class Aplica1 {
    public static void main(String[] args) {

        Funcionario fc1 = new Funcionario("200416116", "Erica", "79879884", 100.00);
        Funcionario fc2 = new Funcionario("169416116", "ze", "49881899", 10.00);

        fc1.cargoFuncionario.setNomeCargo("gerente");
        fc2.cargoFuncionario.setNomeCargo("atendente");

    }

}
