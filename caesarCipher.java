class Result {

    /*
     * Julius Caesar protected his confidential information by encrypting it using a cipher. 
     * Caesar's cipher shifts each letter by a number of letters. If the shift takes you past 
     * the end of the alphabet, just rotate back to the front of the alphabet. In the case of 
     * a rotation by 3, w, x, y and z would map to z, a, b and c.
     * 
     * Original alphabet:      abcdefghijklmnopqrstuvwxyz
     * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
     * 
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k : the alphabet rotation factor
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        String newStr = "", alpha = "abcdefghijklmnopqrstuvwxyz", low = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            int a = alpha.indexOf(low.charAt(i));
            if(a >= 0){
                if(Character.isUpperCase(s.charAt(i))) newStr += Character.toUpperCase(alpha.charAt((a + k)%26));
                else newStr += alpha.charAt((a + k)%26);
            } else newStr += s.charAt(i);
        }
        return newStr;
    }

}