import java.util.*;

public class MethodImplementor
{
    public static void createMethod(String fileName, String header, String body)
    {
        String content = FileManager.readFile(fileName);

        int headerIndex = content.indexOf(header);

        if (headerIndex != -1)
        {
            System.out.println("The method " + header + " already exists. Do you want to overwrite? (y/n)");
            Scanner scan = new Scanner(System.in);
            String check = scan.nextLine();

            if(!check.equals("y"))
            {
                System.out.println("Canceled!");
                return;
            }

            int startIndex = content.indexOf("{", headerIndex);
            int endIndex = content.indexOf("}", headerIndex);

            content = content.substring(0, startIndex + 1) + "\n" + body + content.substring(endIndex);
        }
        else
        {
            int endIndex = content.lastIndexOf("}");
            content = content.substring(0, endIndex) + header + "\n{\n" + body + "}\n" + content.substring(endIndex);
        }
        FileManager.writeToFile(fileName, content);
    }
}