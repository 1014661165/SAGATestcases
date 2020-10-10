package B;

public class B1{
	
	/**
         * 构建后缀数组
         */
        private void buildSuffixArray(){
            //初始化sa
            for (int i=0; i<sa.length; i++){
                sa[i] = i;
            }
            for(int i=0; i<tokens.size()-1; i++) {
                for (int j=i+1; j<tokens.size(); j++){
                    List<Byte> suffix1 = tokens.subList(sa[i], tokens.size());
                    List<Byte> suffix2 = tokens.subList(sa[j], tokens.size());
                    int size = Math.min(suffix1.size(), suffix2.size());
                    boolean result = suffix1.size() < suffix2.size();
                    for (int m=0; m<size; m++){
                        if (suffix1.get(m) < suffix2.get(m)){
                            result = true;
                            break;
                        }else if (suffix1.get(m) > suffix2.get(m)){
                            result = false;
                            break;
                        }
                    }
                    if (!result){
                        int tmp = sa[i];
                        sa[i] = sa[j];
                        sa[j] = tmp;
                    }
                }
            }
        }
}