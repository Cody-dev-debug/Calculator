package bansal.aditya.calculator;


class Calculator {

    public double addition(double num1, double num2){
        return num1 + num2;
    }

    public double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){
        return num1 / num2;
    }

    public double modulus(double num1, double num2){
        return num1 % num2;
    }

    public double squareRoot(double num1, double num2){
        return (num1 * Math.sqrt(num2));
    }
    
    public double power(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public int factorial(int num1){
        int fact=1;
        for (int i = 1; i <=num1; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public double sin(double num1, double num2){
        return num1*Math.sin(num2);
    }
    public double cos(double num1, double num2){
        return num1*Math.cos(num2);
    }
    public double tan(double num1, double num2){
        return num1*Math.tan(num2);
    }
}
