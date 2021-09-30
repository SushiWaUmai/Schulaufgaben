package PlanetenSzenario;

import java.io.*;
import java.util.Scanner;

public class FileManager  
{
    public static void writeToFile(String fileName, String content)
    {
        try
        {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("saved");
        }
        catch (IOException e)
        {
            System.out.print("[ERROR] ");
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName)
    {
        String content = "";

        try
        {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine())
                content += scanner.nextLine() + "\n";
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.print("[ERROR] ");
            e.printStackTrace();
        }

        return content;
    }
}
