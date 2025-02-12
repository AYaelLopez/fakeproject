import java.util.ArrayList;


public class Todo {
    public static void main(String[] args) {
        ArrayList<InnerTodo> lst = new ArrayList<InnerTodo>();

        lst.add(new InnerTodo("homework", "done"));
        lst.add(new InnerTodo("groceries", "done"));
        lst.add(new InnerTodo("exercise", "undone"));
        System.out.println(lst);

    }
}

class InnerTodo {

    public String note;
    public String state;

    InnerTodo(String note, String state){
        this.note = note;
        this.state = state;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "To-do: " + note + " state: " + state;
    }
    
}