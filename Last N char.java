package GitHub_set1r;
import java.util.Scanner;
public class PrintUptoK {

	public static void main(String[] args) {
	 String S,str="";
	 int N,j;
	 System.out.println("Enter S :");
	 Scanner pk=new Scanner(System.in);
     S=pk.next();
     System.out.println("Enter N :");
     N=pk.nextInt();
    	 for(j=S.length()-N;j<S.length();j++) {
    	 str=str+S.substring(j,j+1);
     }
     System.out.println(str);
	}
}

