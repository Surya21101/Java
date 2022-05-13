import java.util.Scanner;
class Class2 extends Class1{
@Override
void disp() {
int sum,sub,mul,div;
Scanner s = new Scanner(System.in);
System.out.println("Enter first no :");
int num1 = s.nextInt();
System.out.println("Enter second no :");
int num2 = s.nextInt();
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1/num2;
System.out.println("Addition is :"+ sum);
System.out.println("Subtraction is :"+ sub);
System.out.println("Multiplication is :"+ mul);
System.out.println("Division is :"+ div);
}
public static void main(String[] args) {
Class2 a = new Class2();
a.disp();
}
}
abstract class Class1 {
abstract void disp();
}
