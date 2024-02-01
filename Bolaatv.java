
// Definindo a classe "Pessoa"
class Bola {
    // Atributos da classe
    private String cor;   // Atributo privado para encapsulamento

    // Método construtor da classe para inicializar os atributos
    Bola(String cor) {
        this.cor = cor;
    }
    
    // Método getter para obter a idade da pessoa
    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }


}

// Classe principal que contém o método main
public class Bolaatv{
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Bola bola1 = new Bola("Azul");
        System.out.println("Cor: " + bola1.getCor()); // Obtém e imprime a idade da pessoa

        bola1.setCor("Roxo");
        System.out.println("Cor: " + bola1.getCor());
    }
}
