import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountChar 
{   
    public static void main(String[] args) 
    {
       BufferedReader reader = null;
       int charCount = 0;
       int wordCount = 0;
       try
        {
          reader = new BufferedReader(new FileReader("tanishk.txt"));
          String currentLine = reader.readLine();
          while (currentLine != null)
            {
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;
                for (String word : words)
                {
                charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
         System.out.println("Number Of Chars In File : "+charCount);
        } 
        catch (IOException e) 
        {
          e.printStackTrace();
        }
        finally
        {
            try
            {
             reader.close();           
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}