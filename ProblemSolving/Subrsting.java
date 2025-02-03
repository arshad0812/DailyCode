public class Subrsting {

    public static boolean FindSubString(String wrd1,String wrd2)
    {
        
        for(int i=0;i<=wrd1.length()-wrd2.length();i++)
        {
            if(wrd1.charAt(i)==wrd2.charAt(0)){

                for(int j=0;j<wrd2.length();j++){
                    if(wrd1.charAt(i+j)!=wrd2.charAt(j)){
                        break;
                    }

                    if(j==wrd2.length()-1){
                        return true;
                    }
                }
            }
        }
        return false;
    } 

    public static void main(String args[]){
        
        System.out.println("Program to find Substring");
        String wrd1="gekeks";
        String wrd2="ks";

        if(FindSubString(wrd1,wrd2)){
            System.out.println("Substring found");
        }
        else{
            System.out.println("Substring not found");
        }

    }
}
