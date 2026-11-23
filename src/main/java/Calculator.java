public class Calculator {
    public int add(int a, int b){
        return a+b
    }
    public int dif(int a, int b){
        return a-b
    }
    public int div(int a, int b){
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed");
        return a/b
    }
    public int times(int a, int b){
        return a*b
    }
    public int solver(){
        return add(1, dif(2, div(3, times(3, 4))))
    }
}
