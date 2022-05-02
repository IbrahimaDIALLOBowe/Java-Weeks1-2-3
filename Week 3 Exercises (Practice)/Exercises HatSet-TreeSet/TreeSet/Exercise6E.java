package Week3.Assignements3.TreeSet;

import java.util.TreeSet;

public class Exercise6E {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<String> t3_set = new TreeSet<>();

        // use add() method to add values in the tree set
        t3_set.add("st1");
        t3_set.add("str2");
        t3_set.add("str3");
        t3_set.add("str4");

        // print our original list
        System.out.println("Original list: "+t3_set);

        // create a new Tree set list having same elements
        TreeSet<String> t4_set = (TreeSet<String>) t3_set.clone();
        System.out.println("Cloned tree set list:"+t4_set);
    }
}
