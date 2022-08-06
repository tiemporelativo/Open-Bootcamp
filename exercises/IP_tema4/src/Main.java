public class Main {
    public static void main(String[] args) {
        int numeroIf =0 ;
        //if
        if (numeroIf>0) {
            System.out.println("El numero  " + numeroIf + " es  Positivo");

        } if (numeroIf<0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        }if (numeroIf==0) {
            System.out.println("El numero " + numeroIf + " es un numero neutro");
        }

        //while
        int numeroWhile = 1;

        while(numeroWhile<3){
            System.out.println("valor de bucle While:"+numeroWhile);
            numeroWhile ++;


        }
        //Do while
        int numeroDoWhile = -2;
        do {
            System.out.println("valor de bucle DoWhile:"+numeroWhile);
            numeroWhile ++;

        }while (numeroWhile<3);
        //For
        for( int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("Valor de numeroFor"+numeroFor);
        }
        //switch
        String estacion="otoño";
        switch (estacion){
            case "verano":

                System.out.println("Es verano");
                break;
            case "otoño":

                System.out.println("Es otoño");
                break;
            case "invierno":

                System.out.println("Es invierno");
                break;
            case "primavera":

                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es estacion ");
        }


    }
}


