class M1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("main end");
	}
}

// Inside a java program, if any abnormal condition is occuring, exception object is raised
// which needs to be handled to let the flow continue, if not handled then flow will be terminated

/*

Abnormal condition can be due to java statement or due to external resources, if it is java stmt then
exception object will be raising, & if external resources then error object will raise.

*/
