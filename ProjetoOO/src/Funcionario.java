public class Funcionario extends Pessoa implements IUser {

    private Double salario;
    public Cargo cargoFuncionario;

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.setSalario(salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(Cargo cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
