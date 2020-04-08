// Finds the root(s) using the quadratic formula
// Fiona Xie
// 4/7/2020
package a2_quad;
import java.util.Scanner; //Scanner
public class A2_quad {

    public static double discrimminant(double a, double b, double c){ // method to find discrimminant
        double dis = Math.pow(b,2)-(4*a*c); // calculates discrimminant
        int num = 0;
            if (dis>0){ // sets num at 2 if discrimmminant greater then 0
                num = 2;
            }
            else if(dis==0){ // sets num at 1 if discrimmminant is equal 0
                num = 1;
            }
        return num; // returns 1 or 2 discrimminants      
    }
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double a = 0.1; //Variables to store coeffiecents entered, set at 0.1 so program runs
        double b = 0.1;
        double c = 0.1;
        double first=0; //Variables to store roots
        double second=0;
        
            
              while (a!=0 && b!= 0 && c!=0){ // runs only when a, b and c variables are not equal to 0
                System.out.print("Enter coefficient a: ");
                a=x.nextDouble(); // gets var a
        
                System.out.print("Enter coefficient b: ");
                b=x.nextDouble();// gets var b
        
                System.out.print("Enter coefficient c: ");
                c=x.nextDouble();// gets var c
                
                if (a==0 && b==0 && c==0){ 
                    break; // ends program if all var are equal to 0
                }
                else if (discrimminant(a,b,c)==2){
                    first=(((-b)+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(a*2)); // calculates first root
                    second=(((-b)-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(a*2)); // calculates second root
                
                    System.out.format("Two roots calculated: %.2f, %.2f \n",first,second);
                }
                else if (discrimminant(a,b,c)==1){
                    first=(((-b)+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(a*2)); //calculates root
                    
                    System.out.format("One root calculated: %.2f",first);
                }
                else {
                    System.out.println("No real roots."); // no real roots
                }
        }
         System.out.println("Bye");
    }
}
        
    
    


    
    

    
