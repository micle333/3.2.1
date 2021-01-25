
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        file.createNewFile();
        File file2 = new File("temp2.txt");
        file2.createNewFile();

        FileReader filereader = new FileReader(file);
        char[] strings = new char[1000];
        filereader.read(strings);

        FileReader filereader2 = new FileReader(file2);
        char[] strings2 = new char[1000];
        filereader2.read(strings2);
        int i;
        for(i = 0; i < strings.length; ++i){
            if (strings[i] != strings2[i]){
                System.out.print(strings[i]);
            }
        }
    }
}

