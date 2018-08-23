package Github_Pro;
import java.util.Scanner;
public class Reversestrings {

	public static void main(String[] args) {
String S,s2="";
System.out.println("Enter S :");
Scanner rs=new Scanner(System.in);
S=rs.nextLine();
String s1[]=S.split(" ");
for(int i=0;i<s1.length;i++){
	s2=s2+new StringBuffer(s1[i]).reverse().toString()+" ";
}
System.out.print(s2);
	}
}
