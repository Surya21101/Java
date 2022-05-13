import java.util.EmptyStackException;
import java.util.Stack;
class StackEg {
public static void main(String[] args) {
Stack<Integer> st = new Stack<Integer>();
boolean b = st.empty();
System.out.println(b);
try {
	st.pop();
} catch (EmptyStackException e) {
	System.out.println("Empty Stack " + e);
}
st.push(90);
st.push(34);
st.push(13);
st.push(78);
System.out.println(st);
st.push(86);
st.push(20);
Integer i = st.peek();
System.out.println("Top Element :" + i);
st.pop();
System.out.println(st);
int j = st.search(78);
System.out.println("Position is :" + j);
}
}