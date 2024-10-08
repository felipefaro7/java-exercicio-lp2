/*A prefeitura do Rio de Janeiro abriu uma linha de crédito para os seus
funcionários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Faça um programa em Java que permita entrar com o salário bruto e o valor da
prestação e informe se o empréstimo pode ou não ser concedido.


resolucao: 
Receber o salário bruto do funcionário.
Receber o valor da prestação do empréstimo.

Calcular 30% do salário bruto.

Comparar o valor da prestação com o resultado do cálculo.
Se a prestação for menor ou igual a 30% do salário, o empréstimo pode ser concedido. Caso contrário, não pode.
*/


public class Emprestimo {
    private float salario;
    private float prestacaoEmprestimo;


    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if (salario < 0){
            salario = 0;
        }
        else {
            this.salario = salario;
        }
    }
    public float getPrestacaoEmprestimo() {
        return prestacaoEmprestimo;
    }
    public void setPrestacaoEmprestimo(float prestacaoEmprestimo) {
        this.prestacaoEmprestimo = prestacaoEmprestimo;
    }

    public double calculaPrestacao(){
        return (30.0/100) * salario;
    }

    public void imprimirResultado (){
        if (prestacaoEmprestimo <= calculaPrestacao()){
            System.out.println("O emprestimo pode ser concedido!!");
        }
        else {
            System.out.println("Nao foi possivel realizar o emprestimo");
        }
        
    }

    
  
}
