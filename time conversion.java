import java.io.*;
import java.util.*;

public class working{
    public static void main(String args[])
    {
        String dt="05:05:00PM";
        char ap=dt.charAt(dt.length()-2);

        
        dt = dt.substring(0, dt.length() - 2);
        
        if(ap =='A')
        {
            int hh = Integer.parseInt(dt.substring(0, 2));
            if(hh==12)
            {   
                hh=0;
            }
            String s=Integer.toString(hh);
           
            if(s.length()==1)
            {
                s="0"+s;
            }
            System.out.println(s + dt.substring(2, dt.length()));
        }
        else
        {
            int hh = Integer.parseInt(dt.substring(0, 2));
            if (hh != 12) hh += 12;
            String s = Integer.toString(hh);
            
            System.out.println(hh + dt.substring(2, dt.length()));
         }
    }
}

//output

// 17:05:00