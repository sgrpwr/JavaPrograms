package Java.Basic.Programs.CountWords;

public class WordCounter {
    public static void main(String[] args) {
        String str = " Sagar    pawar is the bese person. " +
                "he really is!";
        int res = countTheWords(str);
        System.out.println("The sentence you entered has : " + res + " words." );
    }

    private static int countTheWords(String str) {
        char[] ch = str.toCharArray();
        int count = 0,j=0;
        if(str.length()==0) return 0;
        for(int i=0; i<ch.length-1; i++){
            if(ch[i]!=' '){
                count++;
                while (ch[i]!=' ' && (i<ch.length-1)){
                    i++;
                }
            }
        }
        return count;
    }
}
