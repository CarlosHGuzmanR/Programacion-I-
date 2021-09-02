package test;

public class TestArreglos {
    static public void main(String[] args){
        //Los corchetes pueden ir antes o despues de la variable
        int edades[] = new int[3];//No se puede incrementar el limite del arreglo
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
        edades[1] = 11; 
        System.out.println("edades = " + edades[1]);
        
        edades[2] = 12;
        System.out.println("edades = " + edades[1]);
        
        /*edades[3] = 13;
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
        Index 3 out of bounds for length 3
        */
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento" + i + ": " + edades[i]);
        }
    }
}
