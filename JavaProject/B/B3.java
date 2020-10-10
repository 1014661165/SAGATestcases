package B;

public class B3 {
	
	/**
	 * 计算高度数组
	 */
	private void calculateHeight(){
		for (int i=1; i<sa.length; i++){
			List<Byte> pre = tokens.subList(sa[i - 1], tokens.size());
			List<Byte> cur = tokens.subList(sa[i], tokens.size());
			int cnt = 0;
			int size = Math.min(pre.size(), cur.size());
			for (int j=0; j<size; j++){
				if (!pre.get(j).equals(cur.get(j))){
					break;
				}
				cnt++;
			}
			height[i] = cnt;
		}
	}
}