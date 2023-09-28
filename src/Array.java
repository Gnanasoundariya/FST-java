import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Soundariya");//Adding object in arraylist
        list.add("Thiru");
        list.add("Dhakshan");
        list.add("Dhakshana");
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}