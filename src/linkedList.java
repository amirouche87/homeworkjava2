import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {



 LinkedList<String> jskFC = new LinkedList<String>();
 jskFC.add("cristiano ronaldo");

 jskFC.addFirst("lionel messi");
 jskFC.addLast("karim benzema");
 boolean a = jskFC.contains("neymar");
 if (a == true) {
     System.out.println("neymar is in the list");

 }
else{
     System.out.println("neymar is not on the list");
        }
String b = jskFC.getFirst();
String c = jskFC.getLast();
        System.out.println(b+" "+c);

System.out.println(jskFC);
jskFC.offerFirst("riad mahrez");
jskFC.offerLast("yacine brahimi");
System.out.println(jskFC);
jskFC.pollFirst();
jskFC.pollLast();
System.out.println(jskFC);

















    }
}
