import java.io.*;

public class read_write_file {

    public static void readFile(String path){
        String a;
        try {
            FileReader read = new FileReader(path);
            BufferedReader Bufread = new BufferedReader(read);
            while((a = Bufread.readLine()) != null ){
                System.out.println(a);
            }
            Bufread.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();

        }

    }
    public static void writeFile(String path,String txt) {
        try {
            FileWriter write = new FileWriter(path,true);
            BufferedWriter bufWrite = new BufferedWriter(write);
            bufWrite.write(txt);
            bufWrite.close();
            readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
           readFile("src/abc.txt");
           writeFile("src/def.txt","chips is the best");

    }
}
