
import java.util.*;
public class RectangularPattern
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println();
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
