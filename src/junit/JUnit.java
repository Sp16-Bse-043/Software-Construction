/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author sp16-bse-043
 */
public class JUnit {
    
   public int Add(int a, int b){
       int result= a+b;
       System.out.println("Addition of A+B="+result);
        return result;
    }
      public int Sub(int a, int b){
  int result= a-b;
       System.out.println("Addition of A-B="+result);
        return result;
    }
      public int Mul(int a, int b){
         int result= a*b;
       System.out.println("Addition of A*B="+result);
        return result;
      }
        public int Div(int a, int b){
           int result= a/b;
       System.out.println("Addition of A/B="+result);
        return result;
      }
        
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    

     JUnit obj = new JUnit();
     obj.Add(2,5);
     obj.Sub(50, 20);
     obj.Mul(5, 7);
     obj.Div(12, 3);
    }
}
