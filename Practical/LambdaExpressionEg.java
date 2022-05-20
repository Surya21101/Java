interface FunctionalInterfaceEg {
//void add();
int add(int a,int b);
}
class LambdaExpressionEg {
public static void main(String[] args) {
FunctionalInterfaceEg d = (a,b)->{
return (a+b);
//System.out.println("I am functional interface implemented my lambda expression");
};
System.out.println(d.add(40,50));
//d.add();
}
}