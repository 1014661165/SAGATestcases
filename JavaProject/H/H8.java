package H;

public class H8 {
	
	private String diff_linesToCharsMunge(String text, List<String> lineArray,
      Map<String, Integer> lineHash, int maxLines) {
    int lineStart = 0;
    int lineEnd = -1;
    String line;
    StringBuilder chars = new StringBuilder();
    // Walk the text, pulling out a substring for each line.
    // text.split('\n') would would temporarily double our memory footprint.
    // Modifying text would create many large strings to garbage collect.
    while (lineEnd < text.length() - 1) {
      lineEnd = text.indexOf('\n', lineStart);
      if (lineEnd == -1) {
        lineEnd = text.length() - 1;
      }
      line = text.substring(lineStart, lineEnd + 1);

      if (lineHash.containsKey(line)) {
        chars.append(String.valueOf((char) (int) lineHash.get(line)));
      } else {
        if (lineArray.size() == maxLines) {
          // Bail out at 65535 because
          // String.valueOf((char) 65536).equals(String.valueOf(((char) 0)))
          line = text.substring(lineStart);
          lineEnd = text.length();
        }
        lineArray.add(line);
        lineHash.put(line, lineArray.size() - 1);
        chars.append(String.valueOf((char) (lineArray.size() - 1)));
      }
      lineStart = lineEnd + 1;
    }
    return chars.toString();
  }
	
}