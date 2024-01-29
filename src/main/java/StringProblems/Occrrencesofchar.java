package StringProblems;

public class Occrrencesofchar {
    public static void main(String[] args) {
        String s="Hello World";
        char c='l';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) {
                count++;
            }
        }
        System.out.println("The Character ' "+c+"' Appears "+count+" times int the the string '"+s+"'.");
    }

}
