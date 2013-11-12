/**
 * Created with IntelliJ IDEA.
 * User: Denis
 * Date: 09.11.13
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */
public class Print implements ICommand {
    private Context context;

    public Print(Context context) {
        this.context = context;
    }


    public void Execute() {
       Double stackElem = context.Stack.firstElement();
       System.out.println(stackElem);
    }
}
