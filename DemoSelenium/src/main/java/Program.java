
public class Program {

	public static void main(String[] args) 
	{
		 int n=5,c=0,p=1,N=0;
	        for(int i=0;i<n;i++)
	        {
	            c=p;
	            p=N;
	            N=c+p;
	        }
	        System.out.println("N ="+N);
	}

}
