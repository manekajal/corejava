import java.util.Stack;

public class StackExample {

//    public static void pop( Stack stack){
//        System.out.println(" pop operation");
//
//        String s =(String) stack.pop();
//
//        System.out.println(s);
//
//        System.out.println("stack"+stack);
//    }

    public static void main(String[] args) {
        Stack<String> strings =new Stack<>();

        strings.push("kajal");

        strings.push("monika");

        strings.push("Akshay");

       strings.push("Prakash");

        System.out.println(strings);
strings.pop();
        System.out.println(
                "Elements in stack" +strings
        );
//        pop(strings);
//        pop(strings);

    }
}
