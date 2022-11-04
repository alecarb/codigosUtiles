
package matrices;

import java.util.Scanner;

public class Matriz {
    
    private Scanner entrada;
    private int[][] matriz;
    
    public void cargarMatriz(){
        entrada=new Scanner(System.in);
        System.out.print("Ingrese nro de filas: ");
        int filas=entrada.nextInt();
        System.out.print("Ingrese nro de columnas: ");
        int columnas=entrada.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese un digito: "+ "["+f+"]:["+c+"]= ");
                matriz[f][c]=entrada.nextInt();
            }
        }
    }
    
    public void imprimirMatriz(){
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
   }
