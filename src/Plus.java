/**
 * Created with IntelliJ IDEA.
 * User: Denis
 * Date: 09.11.13
 * Time: 17:43
 * To change this template use File | Settings | File Templates.
 */
public class Plus implements ICommand {

    private Context context;

    public  Plus(Context context){

        this.context = context;
    }
    public void Execute() {
        Double stackElem1 = context.Stack.pop();
        Double stackElem2 = context.Stack.pop();
        Double result = stackElem1 + stackElem2;
        context.Stack.push(result);
    }
}
