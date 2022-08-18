public class Empregado{
  private int tipo;
  private double salario;
  private double comissao;
  private double bonus;
  private String nome;
  private int idade;

  public double getSalario() {
    return salario;
  }

  public double getComissao() {
    return comissao;
  }
  public double getBonus() {
    return bonus;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public void setTipo(int tipo){
    this.tipo = tipo;
  }

  public int getTipo(){
    return tipo;
  }

  public double calculaSalario(){
    if (tipo == 1)
      return salario;
    else if (tipo == 2)
      return salario + salario * comissao;
    else if (tipo == 3)
      return salario + bonus;
    else
      return 0;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}