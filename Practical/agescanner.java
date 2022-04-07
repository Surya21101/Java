import java.util.Scanner;
class IfElseIfExample {
public void display() {
Scanner s = new Scanner(System.in);
System.out.println("Enter age :");
int age = s.nextInt();

if (age>=18) {
System.out.println("You are Eligible");
}
else {
System.out.println("You are not Eligible");
}
}
public static void main(String args[]) {
IfElseIfExample j = new IfElseIfExample();
j.display();
}
}