// Finds the root(s) using the quadratic formula
// Fiona Xie
// 4/7/2020
package a2_quad;
import java.util.Scanner; //Scanner
public class A2_quad {

    public static double discrimminant(double a, double b, double c){
        double dis = Math.pow(b,2)-(4*a*c);
        int num = 0;
            if (dis>0){
                num = 2;
            }
            else if(dis==0){
                num = 1;
            }
            else {
                  num = 0;
             }
        return num;          
    }
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double a = 0.1; //Variables to store coeffiecents entered, set at 0.1 so program runs
        double b = 0.1;
        double c = 0.1;
        
        while (a!=0 && b!= 0 && c!=0){ // runs only when a, b and c variables are not equal to 0
            System.out.print("Enter coefficient a: ");
            a=x.nextDouble();
        
            System.out.print("Enter coefficient b: ");
            b=x.nextDouble();
        
            System.out.print("Enter coefficient c: ");
            c=x.nextDouble();
        
            
            System.out.println(discrimminant(a,b,c));
            //System.out.println(a+"x^2 + "+b+"x + "+c);
       
        
        
        }
        System.out.println("Bye");
    }
    
}

    
    

    
