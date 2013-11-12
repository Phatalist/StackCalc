public class Push implements ICommand
{
    private Context context;
    private Double item;

    public Push(Context context, Double item) {

        this.context = context;
        this.item = item;
    }


    public void Execute() {
        context.Stack.push(item);
    }
}
