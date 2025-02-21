/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] shifted;
	private int shift;
//look through all the letters then use
//Use a loop that goes through every letter
// Use two diferent string with difernent names
//If what your looking for is not found use bollen to add it back on dont change it
//22+4% somthing
    public CaesarCipher() {
        
    }

    public CaesarCipher(int num){
        this.shift = num % 26; 
    }
        public String encrypt(String message) {
      StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
         char currentChar = message.charAt(i);
          if (Character.isLetter(currentChar)) {
          char base = (Character.isLowerCase(currentChar))? 'a' : 'A'; // Not sure why i have to have a ? but it says missing either ) or ? and ? works so
          int charIndex = (currentChar - base) % 26;
           int newCharIndex = (charIndex + shift) % 26;

          char newChar = alphabet[newCharIndex];
          if (Character.isUpperCase(currentChar)) {
              newChar = Character.toUpperCase(newChar);
     }
     encryptedMessage.append(newChar);
      } else {
    encryptedMessage.append(currentChar);
         }
    }
    
   return encryptedMessage.toString();
  }
  public String decrypt(String message){
   return "";
}

  public void shifter(int num){
}
}