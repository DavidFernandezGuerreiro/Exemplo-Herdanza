
package exemploherdanza;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudante est=new Estudante("David","Fernandez",18,"3232",10);
        est.amosar();
        System.out.println(est.toString()); 
    }
    
}
