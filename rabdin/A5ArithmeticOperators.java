package JavaPrograms;

public class A5ArithmeticOperators {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;
    System.out.println("Addition: " + (num1 + num2));//15
    System.out.println("Subtraction: " + (num1 - num2));//5
    System.out.println("Multiplication: " + (num1 * num2));//50
    System.out.println("Division: " + (num1 / num2));//2
    System.out.println("Modulus: " + (num1 % num2));//0
    System.out.println("Increment: " + (num1++));//10
    System.out.println("Decrement: " + (num2--));//5  
    System.out.println("After Increment: " + num1);//11
    System.out.println("After Decrement: " + num2);//4  
    System.out.println("Pre-Increment: " + (++num1));//12
    System.out.println("Pre-Decrement: " + (--num2));//3  
    System.out.println("After Pre-Increment: " + num1);//12
    System.out.println("After Pre-Decrement: " + num2);//3  
    System.out.println("Compound Addition: " + (num1 += num2));//15->num1=num1+num2=12+3
    System.out.println("Compound Subtraction: " + (num1 -= num2));//12->num1=num1-num2=15-3
    System.out.println("Compound Multiplication: " + (num1 *= num2));//36->num1=num1*num2=12*3
    System.out.println("Compound Division: " + (num1 /= num2));//4->num1=num1/num2=12/3
    System.out.println("Compound Modulus: " + (num1 %= num2));//1->num1=num1%num2=4%3
    System.out.println("Final Value of num1: " + num1);//1
    System.out.println("Final Value of num2: " + num2);//3
    System.out.println("Expression Result: " + (num1 + num2 * 2));//7->num1+num2*2=1+3*2=1+6=7  
    System.out.println("Expression Result with Parentheses: " + ((num1 + num2) * 2));//8->(num1+num2)*2=(1+3)*2=4*2=8
    System.out.println("Expression Result with Mixed Operators: " + (num1 + num2 * 2 - num1 / num2));//6->num1+num2*2-num1/num2=1+3*2-1/3=1+6-0=7-0=7
    System.out.println("Expression Result with Mixed Operators and Parentheses: " + ((num1 + num2) * (2 - num1 / num2)));//8->(num1+num2)*(2-num1/num2)=(1+3)*(2-1/3)=4*(2-0)=4*2=8 
    System.out.println("Expression Result with Multiple Operators: " + (num1 + num2 * 2 - num1 / num2 + (num1 % num2)));//7->num1+num2*2-num1/num2+(num1%num2)=1+3*2-1/3+(1%3)=1+6-0+1=7-0+1=8  
    System.out.println("Expression Result with Multiple Operators and Parentheses: " + ((num1 + num2) * (2 - num1 / num2) + (num1 % num2)));//9->(num1+num2)*(2-num1/num2)+(num1%num2)=(1+3)*(2-1/3)+(1%3)=4*(2-0)+1=4*2+1=8+1=9  
    System.out.println("Expression Result with Multiple Operators, Parentheses, and Exponents: " + ((num1 + num2) * (2 - num1 / num2) + (num1 % num2)));//9->(num1+num2)*(2-num1/num2)+(num1%num2)=(1+3)*(2-1/3)+(1%3)=4*(2-0)+1=4*2+1=8+1=9  
    System.out.println("Expression Result with Multiple Operators, Parentheses, Exponents, and Modulus: " + ((num1 + num2) * (2 - num1 / num2) + (num1 % num2)));//9->(num1+num2)*(2-num1/num2)+(num1%num2)=(1+3)*(2-1/3)+(1%3)=4*(2-0)+1=4*2+1=8+1=9     
    System.out.println("Expression Result with Multiple Operators, Parentheses, Exponents, Modulus, and Increment/Decrement: " + ((num1 + num2) * (2 - num1 / num2) + (num1 % num2)));//9->(num1+num2)*(2-num1/num2)+(num1%num2)=(1+3)*(2-1/3)+(1%3)=4*(2-0)+1=4*2+1=8+1=9  

    
  }
}
