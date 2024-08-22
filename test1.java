class test
{

public int add(int a, int b)
{
	float sum=0;
	
	
	sum=a+b;
	System.out.println("printing sum:::"+sum);
}


public static void main (String args[])
{

  int a=5,b=10;
  test obj1=new test(int a, int b);	
  obj1.add();
}

}
