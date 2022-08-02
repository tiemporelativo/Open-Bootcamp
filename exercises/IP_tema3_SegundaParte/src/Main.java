
public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.agregarpuerta( );
        System.out.println(miCoche.puerta);

    }
}
class coche{
    public int puerta = 4 ;

    public void agregarpuerta(){
        this.puerta ++ ;
    }

}