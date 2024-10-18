
package primerejercicio;

public class Planeta {
    private String nombre=null;
    private int satelites= 0;
    private double masa = 0;
    private double volumen= 0;
    private int diametro=0;
    private int distancia=0;
    public enum TipoPlaneta{GASEOSO,TERRESTRE,ENANO}
    private TipoPlaneta tipo;
    private boolean observable=false;
  

    public Planeta(String nombre, int satelites, double masa, double volumen, 
            int diametro, int distancia, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen=volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.observable = observable;
    }
    public void clasificar(){
    if(diametro>20000){
            tipo = TipoPlaneta.GASEOSO;
        }else if(diametro> 5000){
            tipo = TipoPlaneta.TERRESTRE;
        }else{
            tipo = TipoPlaneta.ENANO;
        }
    }
    public void valores(){
        System.out.println("Nombre del planeta es = " + nombre);
        System.out.println("Cantidad de satelites = " + satelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diametro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distancia);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + observable);
    
    }
    public void calcular(){
        double calcular = masa / volumen;
        System.out.println("Densidad del planeta = " + calcular);
    }
    
   
    
    public void ua(){
        double resultado = (149597870*3.4);
        if (resultado<distancia) {
            
            System.out.println("Es planeta exterior = verdadero");
            
                   
        }else{System.out.println("Es planeta exterior = falso");}
         
    }
    
    
    
}
