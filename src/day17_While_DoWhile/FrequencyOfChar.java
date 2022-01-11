package day17_While_DoWhile;

public class FrequencyOfChar {


        public static void main(String[] args) {

            String str = "AAABBBCAAAAAAAAA";

            char ch ='A';

            int frequency = 0;

            for (int i = 0; i < str.length() ; i++) { // indexes of str
                char eachChar = str.charAt(i); //eachChar: each character of str

                if(ch == eachChar){ //if given ch is matching with eachChar, then ch is appeared in the string.
                    frequency++;
                }
            }
            System.out.println(frequency);
        }
    }


