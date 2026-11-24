package TEMA6;

public class libro {
    String autor;
    String ISBN;
    int paginas;
    String tematica;
    String titulo;
    boolean disponible = true;

    // Getters and Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // CONSTRUCTORES

    public libro() {
    }

    public libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public libro(String autor, String ISBN, String titulo, String tematica, int paginas) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.tematica = tematica;
        this.paginas = paginas;
    }

    // METODOS

    public void prestarLibro(){
        this.setDisponible(false);
    }

    public void devolverLibro(){
        this.setDisponible(true);
    }


    @Override
    public String toString() {
        return "El titulo del TEMA6.libro es " + titulo + " el autor del TEMA6.libro es " + autor + " y la tematica " + tematica;
    }
}
