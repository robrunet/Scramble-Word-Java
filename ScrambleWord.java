//Ask user for a word and scramble any letters that are not the first or last of the word
import java.util.Scanner;
import java.util.Random;
public class ScrambleWord
{
public static void main(String[] args)
{
String userWord;

Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter a word to scramble");
userWord = keyboard.nextLine();

String scrambledWord = getScramble(userWord);
System.out.println(scrambledWord);

}//end main

public static String getScramble(String wordPassed)
{
String w1, w2;
int l = wordPassed.length();
StringBuffer temp = new StringBuffer("");

//Generate random indexes for different substrings while excluding first and last
int r1 = (int)(Math.random() * l);
int r2 = (int)(Math.random() * l);

while((r1==0) || (r2==0) || (r1==(l-1)) || (r2==(l-1)) || (r1==r2))
   {
    r1 = (int)(Math.random() * l);
    r2 = (int)(Math.random() * l);
   }

//Initialize the letters that need to be switched
w1 = wordPassed.substring(r1, r1+1);
w2 = wordPassed.substring(r2, r2+1);

//Switch the letters using a String buffer 
for(int i=0; i<l; i++)
   {
    if(i==r1)
      temp = temp.append(w2);
    else if(i==r2)
      temp = temp.append(w1);
    else
      temp = temp.append(wordPassed.substring(i, i+1)); 
   }//end for

String changedWord = temp.toString();
return changedWord;
   
}//end method
}//end class 