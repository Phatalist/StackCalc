public class Pop implements ICommand{

    private Context context;
    private Double item;

    public Pop(Context context, Double item){

        this.context = context;
        this.item = item;
    }


    public void Execute() {
        context.Stack.pop(item);
    }
}
