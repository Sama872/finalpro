/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalpro;

/**
 *
 * @author hp
 */
public class finalpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[][]=new int[3][4];
        for(int i=0;i<x.length;i++){  
            for (int j = 0; j < x[i].length; j++) { 
                System.out.println(x[i][j]); 
           } 
        }
        int i = 5, j = 9; 
        System.out.println("Text " + i + j); 
        System.out.println(i + j + " Text");
        String s = "ABC"; 
        s = s + "DE"; 
        System.out.println(s);
        String s2 = "0"; 
        StringBuffer buf = new StringBuffer(s2); 
        for(int ii=1; ii<10; ii++){ 
            buf.append(ii); 
        } 
       s2 = buf.toString(); 
       System.out.println(s2);
            
        }
    
}
