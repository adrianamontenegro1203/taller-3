
package taller.pkg3;


class operacion {
    private static Object op;
     private static Object opr;
     
    public static void main(String[] args) {
        
      op = new aritmetica();
   aritmetica.aritmeticas();
           
        opr = new trigonometrica();
    trigonometrica.trigonometricas();
    
        double result;
        int num1 = 0;
        int num2 = 0;
        
        
        result=num1+num2;
   imprimir imp=new imprimir();
   imp.mostrar(result);
        
  
    }
                    
}
