
// Definindo a classe "Pessoa"
class Carro {
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private String modelo;   // Atributo privado para encapsulamento
    private int ano; // Atributo privado para encapsulamento
    private String cor;   // Atributo privado para encapsulamento
    private int velocidade;

    // Método construtor da classe para inicializar os atributos
    Carro(String marca, String modelo, int ano, String cor, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    // Método getter para obter o nome da pessoa
    
    public String getMarca() {
        return marca;
    }
    // Método getter para obter a idade da pessoa
    public String getModelo() {
        return modelo;
    }
    // Método getter para obter a idade da pessoa
    public int getAno() {
        return ano;
    }
    // Método getter para obter a idade da pessoa
    public String getCor() {
        return cor;
    }
    // Método getter para obter a idade da pessoa
    public int getVelocidade() {
        return velocidade;
    }
}

// Classe principal que contém o método main
public class Projeto{
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Carro carro1 = new Carro("Toyota", "Toyota", 2009, "vermelho", 70);
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("Marca: " + carro1.getMarca()); // Obtém e imprime o nome da pessoa
        System.out.println("Modelo: " + carro1.getMarca()); // Obtém e imprime a idade da pessoa
        System.out.println("Ano: " + carro1.getAno()); // Obtém e imprime o nome da pessoa
        System.out.println("Cor: " + carro1.getCor()); // Obtém e imprime a idade da pessoa
        System.out.println("Velocidade: " + carro1.getVelocidade()); // Obtém e imprime a idade da pessoa

    }
}
