
package exemploherdanza;

/**
 *
 * @author dfernandezguerreiro
 */
public class Persoa {
    private String nome;
    public String apelido;
    private int edade;
    
    Persoa(String nome, String apelido, int edade){
        this.nome=nome;
        this.apelido=apelido;
        this.edade=edade;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }
    
    
    
}
