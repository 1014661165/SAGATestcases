package A;

public class A10{
	
	/**
     * 哈希函数，将字符串映射到[-128,-3]u[125,127]字节空间
     * @param str
     * @return
     */
    private static byte str2hash(String str) {
        str = str.toLowerCase();
        if (str.length() < 2) {
            int h = str.toCharArray()[str.length() - 1];
            h <<= 1;
            return (byte) (-3 - (h & 0x7f));
        } else {
            int h1 = str.toCharArray()[str.length() - 1];
            int h2 = str.toCharArray()[str.length() - 2];
            h1 <<= 1;
            int h = h1 ^ h2;
            return (byte) (-3 - (h & 0x7f));
        }
    }
}