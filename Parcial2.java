import java.util.concurrent.ThreadLocalRandom;

public class Parcial2 {    
    public static void main(String[] args) {
        int ale = 0,acum=0,cand1=0,cand2=0,cand3=0,cand4=0,cand5=0;
        int porccan1=0,porccan2=0,porccan3=0,porccan4=0,porccan5=0;
        int votos [][]= new int[4][5];

        //Votaciones
        for(int i=0; i<4; i++){
          System.out.print("\n------------------------------------------");
            System.out.print("\n Mesa: "+ (i+1));
            for(int j=0; j<5; j++){
            ale = ThreadLocalRandom.current().nextInt(1, 80 +1);
            votos[i][j]=ale;
              System.out.print("\n Votos Candidato "+ (j+1)+ ":  "+votos[i][j]);
              acum += votos[i][j];
            }         
         }
         //Votos totales de cada candidato y porcentaje del total de votos 
         for(int i=0; i<4; i++){
          cand1 += votos[i][0]; 
          cand2 += votos[i][1];
          cand3 += votos[i][2];
          cand4 += votos[i][3];
          cand5 += votos[i][4];
      }
      System.out.print("\n---------------------------------------------------------");
            System.out.print("\n Cantidad de votos"+ acum);
            porccan1 = (cand1*100)/acum;
            porccan2 = (cand2*100)/acum;
            porccan3 = (cand3*100)/acum;
            porccan4 = (cand4*100)/acum;
            porccan5 = (cand5*100)/acum;
            System.out.print("\n VOTOS TOTALES DE LOS CANDIDATOS: ");
            System.out.print("\n Candidato 1:  "+ cand1+ " votos, teniendo un : "+ porccan1+"%"+ " de los votos");
            System.out.print("\n Candidato 2:  "+ cand2+ " votos, teniendo un : "+ porccan2+"%"+ " de los votos");
            System.out.print("\n Candidato 3:  "+ cand3+ " votos, teniendo un : "+ porccan3+"%"+ " de los votos");
            System.out.print("\n Candidato 4:  "+ cand4+ " votos, teniendo un : "+ porccan4+"%"+ " de los votos");
            System.out.print("\n Candidato 5:  "+ cand5+ " votos, teniendo un : "+ porccan5+"%"+ " de los votos");  
          //Candidato mas votado
        int resu [] = {cand1, cand2, cand3,cand3, cand4,cand5};
        int mayor = resu [0];
        for (int i=1; i<resu.length;i++){
          int nume = resu[i];
          if (nume > mayor){
            mayor = nume ; 
          }
        }
        System.out.print("\n El candidato mas votado es: "+ mayor);           
      
  }
}
    

