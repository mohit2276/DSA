import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str= sc.nextLine();
	    int[] fre= new int[str.length()];
	     char[] c= str.toCharArray();
	    for(char ch: c){
	        System.out.print(ch+" ");
	    }
	    for(int i=0;i<str.length();i++){
	        fre[i]=1;
	        for(int j=i+1;j<str.length();j++){
	            if(c[i]==c[j]){
	                fre[i]++;
	                c[j]=0;
	            }
	        }
	    }
	    for(int i=0;i<fre.length;i++){
	        if(c[i]!='0' && c[i]!=' '){
	            System.out.println(c[i]+"-"+fre[i]);
	        }
	        
	    }
		
	}
