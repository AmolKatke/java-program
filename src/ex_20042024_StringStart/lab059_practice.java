package ex_20042024_StringStart;

public class lab059_practice {
    public static void main(String[] args) {
        String name = "Amol ARK"; // bothh are same no new String create
        String name1 = "Amol ARK";  //

        String name2 =  new String("Amol ARk"); //object  area


        System.out.println(name == name1);  // check the reference
        System.out.println(name.equals(name1)); // check the Values


        System.out.println(name == name2);  // check the reference
        System.out.println(name.equals(name2));

    }

}
