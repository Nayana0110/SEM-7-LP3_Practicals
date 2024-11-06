public class FibonacciIterative{
    
    static void fibo(int n){
        int num1 = 0, num2 = 1;

        for(int i=0; i<n; i++){
            System.out.print(num1+" ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
    static int fiboRec(int n){
        //base case
        if(n<=1){
            return n;
        }
        //recursive call
        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    public static void main(String args[]){
        int n = 10;
        System.err.println("Iterative Approach : ");
        fibo(n);
        System.out.println();
        System.out.println("With recursion approach: ");
        for(int i=0; i<n; i++){
            System.out.print(fiboRec(i)+" ");
        }
    }
}