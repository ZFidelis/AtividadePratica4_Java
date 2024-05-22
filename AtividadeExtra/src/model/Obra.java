package model;
public class Obra {
    private String titulo;
    private String artista;
    private int anoCriacao;
    private String tipo;
    private String localizacao;

    //#region Construtores
    public Obra() {

    }
    
    public Obra(String titulo, String artista, int anoCriacao, String tipo, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoCriacao = anoCriacao;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }
    //#endregion
    
    //#region Getters & Setters
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    //#endregion
    
    @Override
    public String toString() {
        return titulo + ", " + artista + ", " + anoCriacao + ", " + tipo + ", " + localizacao;
    }

    public static Obra fromString(String linha) {
        String[] dadosObra = linha.split(", ");

        return new Obra(dadosObra[0], dadosObra[1], Integer.parseInt(dadosObra[2]),dadosObra[3],dadosObra[4] );
    }
}
