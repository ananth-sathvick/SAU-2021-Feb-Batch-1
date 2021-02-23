import java.io.*;

public class Assignment_1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String str = br.readLine();
        
        System.out.println("Enter the substring to be replaced");
        String sub = br.readLine();
        
        System.out.println("Enter the replacement text");
        String rep = br.readLine();
        
        System.out.println("After replacing substring "+sub+" with "+rep);
        System.out.println(str.replaceAll(sub, rep));

    }
}
