package I;

public class I2{
	
	public static void write(String file, String content, boolean append)throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, append), StandardCharsets.UTF_8));
        writer.write(content);
        writer.newLine();
        writer.flush();
        writer.close();
		
		Systen.out.println("-----------------------------------------------------------");
		Systen.out.println("-----------------------------------------------------------");
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, append), StandardCharsets.UTF_8));
        writer.write(content);
        writer.newLine();
        writer.flush();
        writer.close();
    }
	
}