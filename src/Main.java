
class mark{
    int data=40;
    void msg(){System.out.println("40 marks");}
}

public class Main {
    static void myMethod() {
        System.out.println("Im the best developer");
    }
    public static void main(String[] args) {
        /**
         * print "Hello world"
         */
        System.out.println("Hello world!");

        /**
         * call the method
         */
        myMethod();

        /**
         * access modifiers
         */
        mark obj=new mark();
        System.out.println(obj.data);
        obj.msg();

        /**
         * If Else loop condition
         */
        int count = 6;
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }

        /**
         * While loop condition
         */
        int i = 0;
        while (i < 5) {
            System.out.println("While loop: i = " + i++);
        }

        /**
         * Do-While loop condition
         */
        int e=1;
        do{
            System.out.println("Do-While loop: e = " +e);
            e++;
        }while(e<=10);

        /**
         * For loop condition
         */

        for(int a=1;a<=10;a++){
            System.out.println("For loop: a = " +a);
        }

        /**
         * Break loop condition
         */
        for(int r=1;r<=10;r++){
            if(r==5){
                //breaking the loop
                break;
            }
            System.out.println("Break loop: r = " +r);
        }

        /**
         * Break and Continue loop condition
         */
        for (int t = 0; t < 10; t++) {
            if (t == 4) {
                continue;
            }
            System.out.println("Break and Continue loop: t = " +t);
        }


    }

}