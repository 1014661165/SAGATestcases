package B;

public class B9{
	
	/**
     * 计算字符串编辑距离
     * @param tokensX
     * @param tokensY
     * @return
     */
    public static int editDistance(byte[] tokensX, byte[] tokensY){
        int[][] matrix = new int[2][tokensY.length+1];
        for (int i=0; i<matrix[0].length; i++) {
            matrix[0][i] =  i;
        }
        for (int i=0; i<matrix.length; i++) {
            matrix[i][0] =  i;
        }
        for (int i=1; i<tokensX.length + 1; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                Byte b1 = tokensX[i - 1];
                Byte b2 = tokensY[j - 1];
                int leftTop = b1.equals(b2)? matrix[0][j-1]: matrix[0][j-1] + 1;
                int left = matrix[1][j-1] + 1;
                int top = matrix[0][j] + 1;
                matrix[1][j] = Math.min(leftTop, Math.min(left, top));
            }
            System.arraycopy(matrix[1], 0, matrix[0], 0, matrix[0].length);
            Arrays.fill(matrix[1], 0);
            matrix[1][0] = i + 1;
        }
        return matrix[0][matrix[0].length - 1];
    }
}