import java.io.File;
import java.util.Scanner;

public class Assignment1_homeDirectory {
    public static void main(String[] args) {
        Scanner sc;
        try {
            File file = new File("C:\\Users\\Shubham\\IdeaProjects\\Chapter8_Project");
            sc = new Scanner(System.in);
            String[] fileList = file.list();
            //String fileName=sc.nextLine();
            String fileName;
            boolean check=false;
            System.out.println("Please enter the file name or Press -1 to exit");
            while(true)
            {
                 fileName=sc.nextLine();
                if(fileName.equals("-1"))
                {
                    break;
                }
                else {
                    forloop:
                    for (String string : fileList) {
                        //check the name of file present or not and store in boolean result
                        boolean result = fileName.equals(string);
                        // result is true than print the following
                        if (result) {
                            check = true;
                            System.out.println("File Found : " + string);
                            //print the address of the file
                            System.out.println("Path : " + file.getAbsolutePath());

                        }
                    }
                    if (!check) {
                        System.out.println("File not find : Please check the name of the file  and enter the correct name:");
                    }
                    else
                    {
                        System.out.println("Again enter file name  or enter -1  to exit ");
                    }
                }
            }

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
