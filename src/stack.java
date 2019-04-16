import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Object> algeriaGOV = new Stack<Object>();
        algeriaGOV.push("amirouche hammadi");
        algeriaGOV.push("bouteflika");
        algeriaGOV.push("ouyahia");
        algeriaGOV.push("said boutef");
System.out.println(algeriaGOV);
      // to remove the first elements
algeriaGOV.pop();
System.out.println(algeriaGOV);
     // get the first name
System.out.println(algeriaGOV.peek());
     // to search for elements
        int a = algeriaGOV.search("amirouche hammadi");
        System.out.println(a);
        System.out.println(algeriaGOV.search("said boutef"));
        // verify list
        if (algeriaGOV.empty() == true){
            System.out.println("the list is empty ");
        }
else {
    System.out.println("the list is not empty");
        }




    }












}
