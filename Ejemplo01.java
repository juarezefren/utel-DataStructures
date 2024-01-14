package ejemplo01;
public class Ejemplo01 {

    public static void main(String[] args) {
        int[] arreglo = new int[8];
        arreglo [0] = 12;
        arreglo [1] = 1;
        arreglo [2] = 24;
        arreglo [3] = 8;
        arreglo [4] = 95;        
        arreglo [5] = 253;
        arreglo [6] = 7;
        arreglo [7] = 46;
        
        for(int i = 0; i<arreglo.length; i++) {
            System.out.println(arreglo[i]); 
        }
        
        int suma =0;
        for(int i = 0; i<arreglo.length; i++) {
            suma = suma + arreglo[i];            
        }
        System.out.println(suma); 

        

        
    }
    
}
