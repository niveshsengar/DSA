package com.test.dsa.algos;

public class CaesarCipher {

    char [] encoder = new char[26];
    char [] decoder = new char[26];

    public CaesarCipher(int rotation) {
        if(rotation > 26){
            rotation %= 26;
        }
        for(int i = 0; i<26; i++){
            encoder[i] = (char) ('A' + (i + rotation) % 26);
            decoder[i] = (char) ('A' + (i - rotation + 26 ) % 26);
        }
    }

    public String encrypt(String str){
       return transform(str, encoder);
    }

    public String decrypt(String str){
        return transform(str, decoder);
    }

    private String transform(String str, char[] code){

        char [] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= 65 && charArray[i] <= 90){
                int j = charArray[i] - 'A';
                charArray[i] = code[j];
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher(54);
        char[] encoder = cc.encoder;
        char[] decoder = cc.decoder;

        System.out.println("Encoder: "+ new String(encoder));
        System.out.println("Decoder: "+ new String(decoder));

        String toEncrypt = "MY NAME IS ANTHONY GONSALVES";
        System.out.println("Before Encryption "+ toEncrypt);
        String encrypted = cc.encrypt(toEncrypt);
        System.out.println("Encrypted: "+encrypted);
        System.out.println("Decrypted: "+cc.decrypt(encrypted));

    }

}
