package entities;
public class Funcionario {

    public String name;
    public double salarioBruto;
    public double taxa;

    public double salarioLiq() {
        return salarioBruto - taxa;

    }
    public void addFuncionario(double porcentagem) {
        this.salarioBruto += porcentagem * salarioBruto / 100;
    }
    @Override
    public String toString() {
        return name
                + ", R$; " +
                String.format("%.2f", salarioLiq());
    }
}

