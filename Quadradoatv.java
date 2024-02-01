
class Quadrado {
    private int lado;

    Quadrado(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public int CalcularArea(){
        return lado*lado;
    }
}

public class Quadradoatv{
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(3);
        System.out.println("lado: " + quadrado1.getLado()); 
        System.out.println("área: " + quadrado1.CalcularArea());
    }
}
