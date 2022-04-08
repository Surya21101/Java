class PyramidPattern {

public void ppattern(int num) {
for(int i=0;i<num;i++) {
for(int j=0;j<=i;j++) {
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[]) {
PyramidPattern p = new PyramidPattern();
int num=6;
p.ppattern(num);
}
}