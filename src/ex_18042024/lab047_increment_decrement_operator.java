package ex_18042024;

public class lab047_increment_decrement_operator {
    public static void main(String[] args) {
        //pre increment
        //++ in front varialbe like ++a -> pre
        //do increment first then print

        int a= 10;
        System.out.println(++a); //pre ->  madhe reult vadhel and a chi value pn vadhel
        //result ->11
        //a-> 11
        System.out.println(a);
        //

        //post increment
        // ++after vatiable like a+-> post
        //frist print , do increment
        System.out.println(a++); //ya line nanter a chi value vadhel
        //pn reult ans 10 asel
        //result -> 10
        //a -> 11
        System.out.println(a);


    }
}