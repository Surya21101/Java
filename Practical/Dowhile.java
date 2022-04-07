class DoWhileExample {
public void show() {
int b=0;
do
{
System.out.println("Value is :" +b);
b = b-5;
}
while(b>=1);
}
public static void main(String args[]) {
DoWhileExample d = new DoWhileExample();
d.show();
}
}