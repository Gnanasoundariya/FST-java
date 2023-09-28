import java.util.Iterator;
import java.util.Vector;

public class vector {

    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Mutheesh");
        v.add("Mukilesh");
        v.add("Muthra");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
