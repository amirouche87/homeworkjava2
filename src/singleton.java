public class singleton {
    public static singleton single = null;
    public String A;
    public static singleton getInstance(){
        if(single == null)
            single = new singleton();
        return single;
    }

    public static void main(String[] args) {
        singleton A1=singleton.getInstance();
        singleton A2=singleton.getInstance();
        A1.A="secound";
        A2.A="first";
    }
}
