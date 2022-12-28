public class Homework3 {
    // All content is originally created by Bison, please don't distribute it without my permission
    public static void main (String args[]){
        // example of test code, you can uncomment to use it
        // you should see "pig" is print out
        // String s1 = "?pig!";
        // System.out.println(RemoveToken(s1));
        // String s2 = "This%is#a?pig!";
        // System.out.println(RemoveAllToken(s2));
        // String s3 = "good";
        // System.out.println(RevString(s3));
        // String s4 = "madam";
        // System.out.println(CheckPalindrome(s4));
        // String s5 = "zebra";
        // System.out.println(Encrypt(s5, 1));
        // String s6 = "hyl fvb ohwwf dpao jvkpun";
        // for (int i = 1; i <= 25; i++) {
        //     System.out.println(Decrypt(s6, i));
        // }
        Integer i1 = new Integer(2);
        Integer i2 = new Integer(3);

        i1.compareTo(i2);
        i1.equals(i2);

    }
    // Problem 0
    // This question just check your basic understanding
    // for the given String s = "happy"
    // what is s.length() // should be 5
    // what is s.substring(0,1) // should be h
    // what is s.substring(4,5) // should be y
    // what is s.indexOf(p) // should be 2
    // how to loop through the string and print out each character
    // for (int i = 0; i < s.length(); i++) {
    //    System.out.println(s.substring(i, i+1))
    // }
    // 

    // Problem 1
    // Write a method called RemoveToken to remove all the "?" and "!" in the given string
    // You should return a string that "?" and "!" is removed
    // Example (written in the main method): 
    // String s = "I'm a pig!"
    // RemoveToken(s) // this should be "I'm a pig"
    // String s1 = "?I'm a pig!"
    // RemoveToken(s) // this should be "I'm a pig"

    public static String RemoveToken(String str) {
        return "";
    }

    // Problem 2
    // Write a method called RemoveAllToken to remove all the "?", "!", ".", ":", "#", "%" in the given string
    // by using two for loops
    // You should return a string that "?", "!", ".", ":", "#", "%" is removed
    // Example (written in the main method): 
    // String s = "This %is# a? pig !"
    // String s1 = "%5!"
    // RemoveAllToken(s) // this should be "This is a pig"

    public static String RemoveAllToken(String str) {
        // Notice that you can loop through str and the given TOKEN string
        final String TOKEN = "?!.:#%";

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            
            boolean check_i_is_token = false;

            String current_char = str.substring(i, i+1);

            for (int j = 0; j < TOKEN.length(); j++) {

                String current_token = TOKEN.substring(j, j+1);

                if (current_char.equals(current_token)) {
                    check_i_is_token = true;
                }
            }

            if (!check_i_is_token) {
                output = output + "current_char";
            }
        }


        return output;
    }

    // Problem 3
    // Write a method called RevString to reverse a given string
    // Example
    // String s = "good"
    // RevString(s) // this should return "doog"

    public static String RevString(String str) {
        return "";
    }

    // Problem 4
    // Write a method called CheckPalindrome that return true if the given string is palindrome
    // palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
    // Example:
    // String s = "madam"
    // CheckPalindrome(s) // this is true
    // String s1 = "good"
    // CheckPalindrome(s) // this is false

    public static boolean CheckPalindrome(String str) { 
        return str.equals(RevString(str));
    }

    // The following two problems are very challenging

    // Porblem 5
    // Computer Science has a lot of applications. One of them is cryptography (密码学)
    // The most basic way to encrypt (加密) is to use Caesar shift. You can learn more about it in the following link
    // https://zhuanlan.zhihu.com/p/39651578
    // Basically, if you are given a string "i am bison" and shift it by 1 index, you will get "j bn cjtpo" (remember to skip white space)
    // i-j, a-b, m-n, b-c, s-t, o-p, n-o
    // if the string is "zebra" and you shift it by 1 index, you will get "afcsb"
    // z-a
    // if the string is "zybra" and you shift it by 2 index, you will get "badtc"
    // Now you are asked to write a method called Encrypt, where you will be given a string and a shift index
    // and return the encrypted string
    // you can assume that the input string is all lower case and index is between 1 and 25

    // Hint: First create an ordered alphabet (already created for you). Then, create a shift alphabet. For example,
    // if the given index is 1, then, the shift alphabet should be "bcdefghijklmnopqrstuvwxyza"
    // if the given index is 2, then, the shift alphabet should be "cdefghijklmnopqrstuvwxyzab" 
    // you can do so by using substring method
    // Then, for each character in the given string, find the index of this character in the ordered alphabet (by using indexOf)
    // using this index to find the shifted character. For example:
    // shifted alphabet is "bcdefghijklmnopqrstuvwxyza" and you want to encrypt "c"
    // First find the index of c in order alphabet which is 2
    // Then, locate the character in the position 2 in the shift alphabet which is "d"
    // Then the encrypted text is "d"

    public static String Encrypt(String str, int index) {
        // remember to skip white space!
        final String ORDER_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        String shifted_alphabet = ORDER_ALPHABET.substring(index) + ORDER_ALPHABET.substring(0, index);
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            String curr = str.substring(i, i+1);
            int position = ORDER_ALPHABET.indexOf(curr);
            String encode = shifted_alphabet.substring(position, position+1);
            output += encode;
        }
        
        return output;
    }

    // Problem 6
    // Once you have done encryption, you need to think about decryption (解码)
    // suppose you know that a given String is encrypted by Caesar shift and you want to decrypt the original text
    // Write a method called Decrypt where it takes in an encrypted string and the index and returns the decrypted string
    // For example:
    // if the given string is "afcsb" and index is 1, you should return "zebra"
    // a-z, f-e, c-b, s-r, b-a

    public static String Decrypt(String str, int index) {
        // remember to skip white space!
        return "";
    }

    // In the end, please decipher the following code: (you can call decrypt many times with index from 1 to 25 to see which makes sense
    // the test code is provided in the main method)

    // hyl fvb ohwwf dpao jvkpun
}
