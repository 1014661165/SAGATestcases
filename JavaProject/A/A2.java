package A;

public class A2{
	
	
	/**
     * 非对称加密-生成指定算法的公钥和私钥
     * @param keySize 密匙长度
     * @param algorithm 加密算法
     * @return 包含生成的公钥和私钥的列表
     */
    public static List<byte[]> generateKeyPair(int keySize, String algorithm){
        List<byte[]> keys = new ArrayList<>();
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance(algorithm);
            generator.initialize(keySize,  new SecureRandom());
            KeyPair keyPair =  generator.genKeyPair();
            byte[] privateKey = keyPair.getPrivate().getEncoded();
            byte[] publicKey = keyPair.getPublic().getEncoded();
            keys.add(publicKey);
            keys.add(privateKey);
        }catch (Exception e){
            e.printStackTrace();
        }
        return keys;
    }
}