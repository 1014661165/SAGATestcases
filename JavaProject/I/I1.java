package I;

public class I1{
	
	public static List<String> readLines(String file)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null){
            lines.add(line);
        }
        reader.close();
        return lines;
		
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null){
            lines.add(line);
        }
        reader.close();
        return lines;
		
		
    }
	
}