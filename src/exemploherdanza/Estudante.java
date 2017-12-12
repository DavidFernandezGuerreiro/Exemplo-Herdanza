
package exemploherdanza;

/**
 *
 * @author dfernandezguerreiro
 */
public class Estudante extends Persoa {
    private String codigo;
    private int notaFinal;
    
    public Estudante(String nome, String apelido, int edade, String codigo, int notaFinal){
        super(nome, apelido, edade); // <- 1ª sentenza
        this.codigo=codigo;
        this.notaFinal=notaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNotaFinal() {
        return notaFinal;
    }
    
    public void amosar(){
        System.out.println("Nome : "+getNome()+
                "\n Apelido : "+apelido+
                "\n Edade : "+getEdade()+
                "\n Código : "+codigo+
                "\n Nota Final : "+notaFinal);
    }

    @Override
    public String toString() {
        return "Estudante{" + "codigo=" + codigo + ", notaFinal=" + notaFinal + super.toString()+ '}';
    }
    
        
}
