import java.util.Stack;
import java.util.zip.ZipEntry;

import javax.swing.text.html.parser.Element;

public class stackCollection {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // to add the element in the stack 
        animals.push("Lion");
        animals.push("Cow");
        animals.push("Fox");
        animals.push("Elephant");
        animals.push("Monkey");

        System.out.println(animals);
        
        // to see the peek element 
        System.out.println(animals.peek());

        // to remove the peek Element
        System.out.println(animals.pop());

        System.out.println(animals.peek());
    }
}
