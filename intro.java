import java.lang.*;

class demo1_1{
	 static int anyfunction(int x,int y){
		 try{
	         int a = x/y;
			 return a;
		 }
		 catch(ArithmeticException e){
			 System.out.println("division by zero");
		 }
		 return 0;
   }
   public static void main(String args[])
   {    int a,b,result;
          a=0;
		  b=0;
		  System.out.print("enter any two integers : " );
		  try{
         a = Integer.parseInt(args[0]);
		  b = Integer.parseInt(args[1]);
		  System.out.println("value of a and b = "+a+b);
		  }
		  catch(Exception e){
		   result=anyfunction(a,b);
		 System.out.println("result ="+result);
		  }
		 
}
}