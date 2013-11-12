import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Denis
 * Date: 09.11.13
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    Stack<Double> Stack;
    Dictionary<String,Double> Variables;

    public Context() {
        Variables = new Hashtable<String, Double>();
//        Variables.put("a",123.0);
//        Variables.get("a");
//        Variables.remove("a");
        Stack = new Stack<Double>();
    }
}
