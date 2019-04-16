public class outer {
    static int i = 1;
    private static String b = "iby_napoli";

    static class staticNestedClass {
        public void display() {

            System.out.println("outer i " + i);
            System.out.println("outer b " + b);
        }

    }
    public static void main(String[]arg){

        outer.staticNestedClass u = new outer.staticNestedClass();
        u.display();
    }



}
