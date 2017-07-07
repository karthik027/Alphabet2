# Alphabet2
import java.io.*;
import java.util.*;
public class Vowel
{
  public static void main(String args[]) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a alphabet");
    char ch=sc.next().charAt(0);
   if((ch>='a'&&ch>='z')||(ch>='A'&&ch>='Z'))
    {
      System.out.println("It is a alphabet");
    }
    else
    {
      System.out.println("It is not a alphabet");
    }
  }
}
