package I;

public class I3{
	
	public static double MinimumDistance(String sourceStr, String targetString)
	{
		int sourceLength = sourceStr.length();
		int targetLength = targetString.length();
		sourceStr = sourceStr.toLowerCase();
		targetString = targetString.toLowerCase();
		int editMatrix[ ][ ] = new int[sourceLength][targetLength];
		
		for(int i = 0; i < sourceLength; i++)
			editMatrix[i][0] = i;
		for(int j = 0; j < targetLength; j++)
			editMatrix[0][j] = j;
		
		editMatrix[0][0] = 0;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		int sourceLength = sourceStr.length();
		int targetLength = targetString.length();
		sourceStr = sourceStr.toLowerCase();
		targetString = targetString.toLowerCase();
		int editMatrix[ ][ ] = new int[sourceLength][targetLength];
		
		for(int i = 0; i < sourceLength; i++)
			editMatrix[i][0] = i;
		for(int j = 0; j < targetLength; j++)
			editMatrix[0][j] = j;
		
		editMatrix[0][0] = 0;
		
	}
	
}