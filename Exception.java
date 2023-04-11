import java.util.InputMismatchException;
import java.util.Scanner;
public class JavaApplication105 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dividend, divisor, quotient;
        boolean tryAgain = true;
        
        while(tryAgain){
            try{
                System.out.print("Enter Dividend: ");
                dividend = sc.nextInt();
                System.out.print("Enter Divisor: ");
                divisor = sc.nextInt();
                
                if (divisor ==0){
                    throw new ArithmeticException("Divisor cannot be 0.");
            }else if(divisor < 0){
                throw new IllegalArgumentException("Divisor cannot be negative.");
            }
                quotient = dividend / divisor ;
                System.out.println(dividend + "/ " + divisor + " = " + quotient);
                
                tryAgain = false ;           
            } catch (InputMismatchException ex){
                System.out.println("Invalid Input. Pls enter an integer. ");
                sc.nextLine();
            }catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
                tryAgain = promptTryAgain(sc);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                tryAgain = promptTryAgain(sc);
            }finally{
                System.out.println("Great!");
            }
        }
    }

    private static boolean promptTryAgain(Scanner sc) {
        
        System.out.print("Try Again? (yes/no): ");
        String response = sc.next();
        if (response.equalsIgnoreCase("yes")) return true;
        //else if (response.equalsIgnoreCase("no")) return false;
        return false;
       
    }
    
}
