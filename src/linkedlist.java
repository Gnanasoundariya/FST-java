import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
        public static void main(String args[]) {
            LinkedList<String> al = new LinkedList<String>();
            al.add("Dinesh");
            al.add("Raj");
            al.add("Radha");
            al.add("Suda");
            Iterator<String> itr = al.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

