package file.io;
import java.io.*;
import java.nio.file.*;

/**
 *
 *
 */
public class FileIO {


    public static void main(String[] args) throws IOException {
        String in = new String(Files.readAllBytes(Paths.get("./in.txt")));
        String out = new String();
        int[] list = new int[in.length()];
        String[] content = new String[in.length()];
       content = in.split("\r\n");
       for (int i=0; i< content.length; i++){
           list[i] = Integer.parseInt(content[i]);
           list[i] =  list[i]%5;
       }
      // StringBuilder sass = new StringBuilder();
       for (int i=0; i< content.length; i++){
       //    sass.append(list[i] + "\r\n");
       out.concat(content[i] + " \r\n");
       }
     // String out = sass.toString();
       Files.write(Paths.get("./Newman_Hunter File I_O.txt"), out.getBytes());
        
        
    }
    
}