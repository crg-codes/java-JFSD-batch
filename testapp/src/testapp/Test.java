package testapp;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String st=obj.next();
        
        
        for(int i=0;i<st.length()-1;i++)
        {
            char ch=st.charAt(i);
            int n=Character.getNumericValue(ch);
            System.out.println(n);
            
        }
        
        
       
        
        
        
        
        
        
        
        
        
    }
}
