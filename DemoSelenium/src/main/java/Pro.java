
public class Pro {

	public static void main(String[] args) 
	{

       int n=654,sum=0,r=0;
       while(n > 0) 
       {
            r=n%10;
            sum=(sum*10)+r;
            r=n/10;
        }

   	System.out.println("sum ="+sum);
    }

	

}
