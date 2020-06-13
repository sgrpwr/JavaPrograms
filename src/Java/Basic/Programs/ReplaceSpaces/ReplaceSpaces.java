package Java.Basic.Programs.ReplaceSpaces;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] args){
        String str = "Mr 3ohn Smith";
        char[] ch = str.toCharArray();
        //char[] ch1 = new char[];
        ArrayList<Character> ch1 = new ArrayList<Character>();
//        Scanner scanner = new Scanner(System.in);
//        string = scanner.nextLine();
        int j=0;
        for(int i=0; i<str.length(); i++){
            if(ch[i]==' ') {
                ch1.add(j, '%'); j++;
                ch1.add(j, '2'); j++;
                ch1.add(j, '0'); j++;
            }
            else {
                ch1.add(j, ch[i]);
                j++;
            }
        }
        String s = ch1.toString();
        System.out.println(s);
    }
}
