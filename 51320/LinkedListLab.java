import java.util.LinkedList;
import java.util.*;


public class LinkedListLab {
    
    //CAN declared variable here. must be in the class scope denoted by purple brackets
    // public static void isItEmpty(){
    //     System.out.println("This isItEmpty method just ran.");
    // }
    public static void main( String[] args) {
         LinkedList<String> list1 = new LinkedList<>();
        // list1.add("Testing");

        //#1 test to see if empty
        System.out.println(isItEmpty(list1));
        //isItEmpty();
        //System.out.println("This is from the main method.");

        //#2 adds nodes
        addNode(list1, "Testing our second method");
        addNode(list1, "Another test of our method");
        System.out.println(list1);
        //#3
        // makeEmpty(list1);
        System.out.println(makeEmpty(list1));

        //#4 prints each node on a separate line
        LinkedList<String> list = new LinkedList<>();
        addNode(list1, "John Coltrane");
        addNode(list1, "Herbie Hancock");
        addNode(list1, "Grover Washington");
        addNode(list1, "Dexter Gordon");
        addNode(list1, "Horace Silver");
        addNode(list1, "Kenny G");
        addNode(list1, "Max Roach");
        loopList(list1);
        //#5 use remove to delete node at that specific index
        remNode(list1, 5);
        //#6 removes all nodes from list
        // remEach(list1);
        //#7 adds a new node to the beginning of a LinkedList
        addFirst(list1, "Miles Davis");
        System.out.println();
        //#8
        // addAfter(list1, "Grover Washington");
        //#9
        LinkedList<String> list2 = new LinkedList<String>();
        addNode(list2, "Nancy Wilson");
        addNode(list2, "Rachelle Ferrell");
        addNode(list2, "Dianne Reeves");
        appendsList(list1, list2);
        System.out.println(); 
        //#10
        System.out.println();
        printRev(list1);
        Collections.reverse(list1);
    }  
    //creating a method to define a class
    // public static void isItEmpty(){
    //     System.out.println("This isItEmpty method just ran.");
    //  }
        //#1 test to see if empty
    public static boolean isItEmpty( LinkedList<String> list) {
            //to look at node inside of list : list.peek() or (list.size() == 0)
            if(list.peek() == null){
                return true;
            }else{
                return false;
            }
        }
    //#2 defining new method called addNode
    // void because no value is being returned when called
    public static void addNode(LinkedList<String> list,  String nodeData){//(passing in a string)
        list.add(nodeData);
    }
    //3 makeEmpty
    public static String makeEmpty(LinkedList<String> list){
    if (isItEmpty(list)) { // can use list.size()==0
        return "List was already empty";
    }else{
        list.clear();
        return "This list is now empty";
    }

}

    //#4each line
    public static void loopList(LinkedList<String> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    //#5 remove
        public static void remNode(LinkedList<String> list1, int index){
            list1.remove();
           }
    //#6 remove each
        // public static void remEach(LinkedList<String> list1, ) {
        //     String[] array = list.toArray(new String{list.size()]);
        //         for (int i=0; i <array.length; i++){
        //             remEach(list1, i);
        //         }if (list1.size()==0){
        //             System.out.println("Everything has been removed");
        //         }
        // }
    //#7 newNode at Begin
    public static void addFirst(LinkedList<String> list, String list1) {
        list.addFirst(list1);
    }
    //#8 newNode
    // public static void addAfter(LinkedList<String> list1, String node, int index) {
    //     list1.add(index + 1, node);
    // }
    //#9 append
    public static void appendsList(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
    }
    //#10
    public static void printRev(LinkedList<String> list) {
        Collections.reverse(list);
        for(String values: list) {
            System.out.println(values.toString());
        }
    }
     
}


