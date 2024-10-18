
package primerejercicio;

public class PrimerEjercicio {

   
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tiera",1 , 5.9736E24,1.08321E12,12742,
                150000000, true);
        tierra.clasificar();
        tierra.valores();
        tierra.calcular();
        tierra.ua();
        
        System.out.println("");
        
        Planeta jupiter = new Planeta("júpiter", 79, 1.899E27,1.4313E15,139820, 
                750000000, true);
        jupiter.clasificar();
        jupiter.valores();
        jupiter.calcular();
        jupiter.ua();
    
    }
    
}
