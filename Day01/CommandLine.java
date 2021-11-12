
public class CommandLine
{
	public static void main(String args [])
	{
		System.out.println("The Command Line Arguments are:\n");
		for(int i = 0; i < args.length; i++) 
		{
			System.out.println("args["+i+"]:"+args[i]);
		}
	}
}
