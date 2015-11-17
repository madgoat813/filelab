
package filelab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tmcfall
 */
public class FileLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char sep = File.separatorChar; 
        
       File data = new File("C:" + sep + "temp" + sep + "lab1.txt" );
       
       if (data.exists()) {
           BufferedReader br = null;
           try {
               br = new BufferedReader(new FileReader(data));
               String line = br.readLine();
               while(line != null){
		  System.out.println(line);
		  line = br.readLine();
               }
           } catch (IOException ioe) {
            System.out.println("Cannot Read this File");
        } finally {
               try{
               br.close();
               }catch(Exception e){
                   System.out.println("An Error Occured");
               }
           }
       }
       PrintWriter pw = null;
       try {
       pw = new PrintWriter(new BufferedWriter(new FileWriter(data, true)));
       //pw.println("");
       pw.println("Molly McFall");
       pw.println("76543 King Ave.");
       pw.println("Madison, WI 53444");
       pw.println("Jack Black");
       pw.println("6868 Roudy Ln.");
       pw.println("Miami, FL 77363");
       }catch (IOException ioe) {
           System.out.println("Cannot Write to this File");
       }finally {
           try{
               pw.close();
           }catch (Exception e) {
               System.out.println("An Error Occured");
           }
       }
    }
    
}
