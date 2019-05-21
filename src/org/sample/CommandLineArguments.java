package org.sample;

public class CommandLineArguments {
	
	public static void main(String[] args) {
		
		int count= args.length;
		String string;
		System.out.println("num of argumnets entered: " +count);
		for (int i=0;i<count;i++)
		{
		string = args[i];
        System.out.println(string);		
		}
		
	}

}
