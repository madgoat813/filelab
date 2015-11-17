/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tmcfall
 */
public class FileLab3 {
    public static void main(String[] args) {
       char sep = File.separatorChar; 
       int contactNum = 1;
       File data = new File("C:" + sep + "temp" + sep + "lab1.txt" );
       Map blackBook  = new HashMap();
       
       if (data.exists()) {
           BufferedReader br = null;
           try {
               br = new BufferedReader(new FileReader(data));
               String line = br.readLine();
               
               while(line != null){
                   
                   List<String> contact = new ArrayList<String>();
                   for( int i = 0; i < 3; i++) {
		  contact.add( line);
		  line = br.readLine();
                   }
                   blackBook.put(contactNum, contact);
                   contactNum++;
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
           
           
           String[] string = blackBook.get(2).toString().split("\\W+");
           
           
           
           System.out.println(string[1] + " " + string[2] + " lives in: ");
           switch (string[7]) {
               case "IL":
                   System.out.println("Illinois");
                   break;
               case "WI":
                   System.out.println("Wisconsin");
                   break;
               case "TX":
                   System.out.println("Texas");
                   break;
               default:
                   System.out.println("Florida");
                   break;
           }
           System.out.println(blackBook.get(1));
           
           
       }
       
       
       
    }

    
    
}
