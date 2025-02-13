import java.util.ArrayList;
import java.util.Scanner;


public class Todo {

    static ArrayList<InnerTodo> lst = new ArrayList<InnerTodo>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("Add some task: ");
        System.out.println("To-do: ");
        String nte = sc.nextLine();
        System.out.println("State: ");
        String ste = sc.nextLine();
        addNote(nte, ste);
        System.out.println(lst);
        System.out.println("");

        switch (ste) {
            case 1:
                
                
                break;
        
            default:
                break;
        }
        System.out.println(lst);
        chState(0);
     
    }
     
    public static void addNote (String note, String state){
        lst.add(new InnerTodo (note, state));
    }

    public static void chState (int n){
        InnerTodo s = lst.get(n);
        String newste = sc.nextLine();
        s.changeState(,  newste);
    }
}

class InnerTodo {

    public String note;
    public String state;

    InnerTodo(String note, String state){
        this.note = note;
        this.state = state;
    }

    public void changeState (, String state){
        
        this.state = state;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "To-do: " + note + " state: " + state;
    }
    
}