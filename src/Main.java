import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

	    Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String inLine = sc.nextLine();
            ICommand command = null;
            if(inLine.contains("PUSH"))
            {
                String parameter = inLine.split(" ")[1];
                command = new Push(context, new Double(parameter));
            }
            else if(inLine.contains("PRINT")){
                command = new Print(context);
            }
            else if(inLine.contains("PLUS")){
                command = new Plus(context);
            }


            if(command != null)
                command.Execute();
        }



    }
}
