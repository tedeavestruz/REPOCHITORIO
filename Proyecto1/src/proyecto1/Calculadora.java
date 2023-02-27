/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
//ESTE ARCHIVO HA SIDO CAMBIADO
//ArchivoTerminal

//Cambiado desde github
/**
 *
 * @author Yo mismo
 * @see Calculadora
 * @version 2022/2023
 * @since 1/1/2023
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    /**
     * 
     * @param a recibe el primer numero entero
     * @param b recibe el segundo numero entero
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /**
     * 
     * @return un entero con la suma dos números
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * 
     * @return un entero con el parámetro mayor del objeto de la clase restado con el menor
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    /**
     * 
     * @return devuelve true si el primer param del objeto es mayor que el segundo
     * y devuelve false si el segundo param del objeto es mayor que el primero
     */
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /**
     * 
     * @return un entero que es la multiplicación del primero por el segundo 
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
     * 
     * @return devuelve un entero que es la división del primero por el segundo
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @return devuelve nulo si el segundo numero es 0, si no lo es
     * devuelve el objeto Integer resultado de dividir el primer número por el segundo número
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    /**
     * @throws java.lang.ArithmeticException
     * @exception java.lang.ArithmeticException
     * @return un entero que es la división del primer número por el segundo número
     */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @deprecated no sirve para nada realmente
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
 
}
