package Github_Pro;
import java.util.Scanner;
public class SumofAllElements {

	public static void main(String[] args) {
		int N;
		System.out.println("Enter N value :");
		Scanner se=new Scanner(System.in);
		N=se.nextInt();
		int i,j,sum=0;
	if(N<1) {
		N=-N;
	}
	if(N>=1 && N<=10000) {
		int a[]=new int[N];
		for(i=0;i<N;i++) {
			a[i]=se.nextInt();
		}
		for(i=0;i<N;i++) {
			sum = sum+a[i];
		}  
	}
		System.out.println(sum);
	}
}
