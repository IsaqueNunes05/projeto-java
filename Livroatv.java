class Livro{
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String gettitulo(){
        return titulo;
    }
    public String getautor(){
        return autor;
    }
    public int getanoDePublicacao(){
        return anoDePublicacao;
    }
}

public class Livroatv{
    public static void main(String[] args) {
        Livro livro1 = new Livro("Sherlock Holmes", "Arthur Conan", 1830);
        
        System.out.println("Titulo: " + livro1.gettitulo() + "\nAutor: " + livro1.getautor() + "\nAno de publicacao: " + livro1.getanoDePublicacao());
    }
}
