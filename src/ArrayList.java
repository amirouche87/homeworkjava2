public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> busY = new java.util.ArrayList<String>();
        busY.add("volvo");
        busY.add("honda");
        busY.add("ford");
        busY.add("dodge");
        busY.add("chevey");

        System.out.println(busY);

        String a = busY.get(2);

        System.out.println(a);
        busY.set(1,"sonacom");
        System.out.println(busY);
        busY.remove(4);
        int Z = busY.size();
        System.out.println(Z);




    }
}
