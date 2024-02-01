
class Bola {
    private String cor;

    Bola(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}

public class Bolaatv{
    public static void main(String[] args) {
        Bola bola1 = new Bola("Azul");
        System.out.println("Cor: " + bola1.getCor()); 

        bola1.setCor("Roxo");
        System.out.println("Cor: " + bola1.getCor());
    }
}
