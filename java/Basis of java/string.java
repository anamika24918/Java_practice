import java.util.*;
public class string{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

 public static boolean ispalindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-1-i)){
            //not a palindrome
            return false;
        }
    }
    return true;
 } 
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
           
            if (str.charAt(i) == ' ' && i < str.length() - 1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String newstr ="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr +=str.charAt(i);
            if(count>1){
                newstr +=count.toString();
            }
        }
        return newstr;
    }

 public static void main(String args[]){
    // String firstname="Anamika";
    // String secondname="Singh";
   
    // String fullname=firstname +" "+secondname;
    // printletters(fullname);
    //  String str="racecar";
    // System.out.println(ispalindrome(str));//O(N)

    // String path="WNEENESENNN";
    // System.out.println(getshortestpath(path));

    // String str="helloworld";
    // System.out.println(str.substring(0,5));//java inbulit function to find a subarray
    // System.out.println(substring(str,0,5));

    // String str="hi, i am anamika";
    // System.out.println(toUpperCase(str));

    String str ="aaaaabbbcccddd";
    System.out.println(compress(str));//O(n)

 }
}