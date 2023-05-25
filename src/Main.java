public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //    if else loop condition

        int count = 6;
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }

        //While loop condition

        int i = 0;
        while (i < 5) {
            System.out.println("While loop: i = " + i++);
        }

        //Do-while loop condition

        int e=1;
        do{
            System.out.println(e);
            e++;
        }while(e<=10);

        //For loop condition

        for(int a=1;a<=10;a++){
            System.out.println(a);
        }

        //break condition
        for(int r=1;r<=10;r++){
            if(r==5){
                //breaking the loop
                break;
            }
            System.out.println(r);
        }

        // continue condition

        for (int t = 0; t < 10; t++) {
            if (t == 4) {
                continue;
            }
            System.out.println(t);
        }

    }

}