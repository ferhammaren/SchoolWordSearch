package testsopa;




import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mostro
 */
class Sopa {
    char[][] sopa;
    int renglones;
    int columnas;
    String[] lista;
    
    
    public Sopa()
    {  
        this.renglones=20;
        this.columnas=20;
        sopa=new char[renglones][columnas];
            for(int x=0;x<20;x++){
               for(int y=0;y<20;y++){ 
                   Random r= new Random();
                   int p=r.nextInt(26)+65;
             sopa[x][y]=(char) p;
                }
           }
    }
    
    public Sopa(int num) //constructor que recibe renglones
    {
       this.renglones=num;
       this.columnas=num;
       sopa=new char[renglones][columnas];
            for(int x=0;x<renglones;x++){
               for(int y=0;y<columnas;y++){                   
             Random r=new Random();
                   int p=r.nextInt(26)+65;  
             sopa[x][y]=(char) p;
                }
           }
    }
    
//public String[] Lista(String[] lista){
//    for (int l=0;l<renglones;l++){
//        
//    }
//    
//}
//   public void Lista(String[] lista={}){
//      lista={"Mathi,doggeh,kitteh"};
      
   //}
    public String showLista(){
       String Lista="";
        for (int l=0;l<renglones;l++){
           Lista+=lista[l]+" ";
           Lista+="\n";
       }
        return Lista;
             }

    
    @Override
    public String toString(){
        String cadena="";
        for (int n=0;n<renglones;n++){
            for (int c=0;c<columnas;c++){
                cadena+=sopa[n][c]+" ";                
            }
            cadena+="\n";
        }
      return cadena; 
    } 
//public char show(){
//    char[][] matr= sopa[][];    
//    for (int n=0;n<renglones;n++){
//            for (int c=0;c<columnas;c++){
//                return mat;                
//            }
//           matr+="\n";
//        }
//      return matr;    
//}
}

    


       
//en el punto 7, generar dos valores aleatorios para poner en donde va a empezar la palabra Solo se puede la palabra horizontal, vertical y diagonal
// verificars que quepa.
       //que hacer si se sobrescribe? hacer otra matriz booleana con falsos, y al poner una palabra sean valores verdaderos
       //en donde esta ocpuada. Comprobar si esta ocupado el espacio y si si, moverlo de lugars.
       
