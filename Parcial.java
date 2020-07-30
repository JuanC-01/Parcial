import java.util.concurrent.ThreadLocalRandom;

public class Parcial {
    public static void main(String[] args) {
        int vent = 0, prome = 0;
        int anñ1=0,anñ2=0,anñ3=0,anñ4=0,anñ5=0, max=0;
        
        int inf [][]= new int[12][5];
        //ventas por mes
        for(int i=0; i<12; i++){
            System.out.print("\n---------------------------------------------------------");
            System.out.print("\n MES "+ (i+1));
            for(int j=0; j<5; j++){
                vent = ThreadLocalRandom.current().nextInt(15000, 30000 +1);
                inf[i][j]=vent;
                    System.out.print("\n Ventas de la sede: "+ (j+1) + " "  +inf[i][j]); 
            }
        }
        //Ventas Anuales de las sedes
            for(int i=0; i<12; i++){
                anñ1 += inf[i][0]; 
                anñ2 += inf[i][1];
                anñ3 += inf[i][2];
                anñ4 += inf[i][3];
                anñ5 += inf[i][4];
            }
            System.out.print("\n---------------------------------------------------------");
            System.out.print("\n VENTA ANUAL DE LAS SEDES: ");
            System.out.print("\n Sede 1:  "+ anñ1);
            System.out.print("\n Sede 2:  "+ anñ2);
            System.out.print("\n Sede 3:  "+ anñ3);
            System.out.print("\n Sede 4:  "+ anñ4);
            System.out.print("\n Sede 5:  "+ anñ5);
        //Promedio de ventas de la sede 4
        System.out.print("\n---------------------------------------------------------");
        prome = (anñ4/12);
        System.out.print("\n El promedio de las ventas de la sede 4 es: "+ prome );
        //Sede que obtuuvo la mayor venta
        System.out.print("\n---------------------------------------------------------");
        System.out.print("\n " + max);
        int [] resu = new int []{anñ1, anñ2, anñ3,anñ3, anñ4,anñ5};
        int indicemayor = 0;
        for (int i=0; i<resu.length;i++){
          if (resu[i] > resu[indicemayor]);
           indicemayor = i ;
        }
        
        int mayor = resu[indicemayor];
        System.out.print("\n La sede que obtuvo una mayor venta es de : "+ mayor + " y le pertenece a: "+  resu[indicemayor]);
    }
        
    
}
