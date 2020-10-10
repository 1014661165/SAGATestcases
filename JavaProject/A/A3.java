package A;

public class A3{
	
	/**
     * 非对称加密-使用公钥加密信息
     * RSA加密对信息的长度有限制，而且长度限制与密码生成的时候指定的keySize线性相关
     * 加密信息最大长度 = keySize/8 - 11
     * @param msg
     * @param publicKey
     * @return
     */
    public static byte[] encrypt(String algorithm, byte[] msg, byte[] publicKey){
        byte[] encodedMsg = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
            PublicKey key = keyFactory.generatePublic(new X509EncodedKeySpec(publicKey));
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            encodedMsg = cipher.doFinal(msg);
        }catch (Exception e){
            e.printStackTrace();
        }
        return encodedMsg;
    }
}