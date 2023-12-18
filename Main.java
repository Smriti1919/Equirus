import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans=getLexiLargest(s);
		System.out.println(ans);
	}
	public static String getLexiLargest(String s){
	    int n=s.length();
	    char max=s.charAt(0);
	    int pos=0;
	    for(int i=1;i<n;i++){
	        char ch=s.charAt(i);
	        if(max<ch){
	        max=ch;
	        pos=i;
	        }
	    }
	    s=max+ s.substring(1,pos)+ s.charAt(0)+s.substring(pos+1);
	    return s;
	}
}
