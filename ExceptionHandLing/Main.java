package ExceptionHandLing;

public class Main {
    public static void main(String[] args) {
        int a=50;
        int b=0;
        try {
            // This line would throw ArithmeticException ONLY if uncommented
            // because divide() explicitly throws it when b == 0
            // int c = divide(a, b);
            // System.out.println(c);
            String A = "vinay";
            String B = "vina";
            // This line throws MyException ONLY when condition matches inside method
            // Since MyException is a CHECKED exception(Compile time Par hone wale), compiler forces us to handle it
            checkDoesStringEql(A, B);
        }
        catch (MyException e) {
            // Handles custom checked exception thrown from checkDoesStringEql()
            System.out.println("Custom Exception: " + e.getMessage());

        }
        catch (ArithmeticException e) {
            // Handles runtime exception from divide() if division by zero happens
            // iske try block me agar nhi bhi likkha wo to complie time error nhi ayega
            // as unchecked which are on runtime
            System.out.println("Arithmetic Exception: " + e.getMessage());

        }
        catch (Exception e) {
            // Generic fallback for any other exception not handled above
            System.out.println("General Exception: " + e.getMessage());

        }
        finally {
            // Always executes whether exception occurs or not
            System.out.println("No matter what this will always execute");
        }
    }

    public static int divide(int a,int b) throws ArithmeticException {
        if (b==0){
            throw new ArithmeticException("Gadbad hai re baba!!");
            // this is done like explicetly
        }
        return a/b;
    }
    public static boolean checkDoesStringEql(String A,String B) throws MyException{
        if (A.equals(B)){
            throw new MyException("Yes Both String Are Not Equal");
        }
        return false;

    }

}
//Throwable
//        └── Exception
//               └── RuntimeException
//                        └── ArithmeticException