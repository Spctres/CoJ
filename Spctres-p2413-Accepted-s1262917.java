import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
int a,i;
Scanner l=new Scanner(System.in);
	ArrayList<String> total = new ArrayList<String>();
a=l.nextInt();
String s="";
 for(i=0;i<a;i++){
			s=l.next();
			int n=s.length();
			char h=s.charAt(n-1);
		if(h=='5'||h=='0'){
			total.add("YES");
		}
		else{
			total.add("NO");
		}
 }
		 for(i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
}
}