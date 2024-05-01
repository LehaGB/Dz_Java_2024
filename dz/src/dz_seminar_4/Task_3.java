package dz_seminar_4;

import java.util.Stack;

public class Task_3 {
    Stack<Double> stack = new Stack<>();
    double result;
    public static void main(String[] args) {
        Task_3 task3 = new Task_3();
        System.out.println(task3.calculate('+', 3, 7));
        System.out.println(task3.calculate('/', 9, 3));
        System.out.println(task3.calculate('<', 0, 0));
    }
    public double plus(int a , int b){
        double res = a + b;
        stack.addFirst(res);
        return res;
    }

    public double minus(int a , int b){
        double res = a - b;
        stack.addFirst(res);
        return res;
    }

    public double multiplication(int a , int b){
        double res = a * b;
        stack.addFirst(res);
        return res;
    }

    public double division(int a , int b){
        double res = a / b;
        stack.addFirst(res);
        return res;
    }

    public double popOperation(){
        double result =  stack.pop();
        double result2 = stack.pop();
        stack.push(result);
        return stack.peek();
    }

    public double calculate(char op, int a, int b) {
        if(op == '+'){
            result = plus(a, b);
        }
        else if(op == '-'){
            result = minus(a, b);
        }
        else if(op == '*'){
            result = multiplication(a, b);
        }
        else if(op == '/'){
            result = division(a, b);
        }
        else if (op == '<') {
            result = popOperation();
        }
        else{
            throw new RuntimeException("Такой операции не найденно");
        }
        return result;
    }
}
