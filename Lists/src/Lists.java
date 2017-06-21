import java.io.*;
import java.util.*;

public class Lists {
//test comment
//new comment
//develop comment
//develop comment - 2nd
 public static void main(String[] args) throws IOException {
  List<String> list = new ArrayList<String>();
  Scanner in = new Scanner(new File("C:\\1\\File.txt"));
  while (in.hasNextLine())
   list.add(in.nextLine());

  String[] strArray = list.toArray(new String[0]);
  in.close();

  for (int i = 0; i < strArray.length; i++) {
   for (int j = 0; j < strArray.length - 1 - i; j++) {
    if (strArray[j].length() > strArray[j + 1].length()) {
     String str = strArray[j];
     strArray[j] = strArray[j + 1];
     strArray[j + 1] = str;
    }
   }
  }

  for (String s : strArray) {
   System.out.println(s);
  }
 }
}