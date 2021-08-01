import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your email address: ");
        String email=sc.nextLine();
        
        if(email.contains("@") && email.contains("."))
        {
            int atPos = email.indexOf("@");
            int dotPos = email.indexOf(".");
            
            String username=email.substring(0, atPos);
            String host=email.substring(atPos+1, dotPos);
            String domain=email.substring(dotPos+1, email.length());
            
            if(username.length()>=2 && host.length()>=2 && domain.length()>=2)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        else
        {
            System.out.println("Invalid");
        } 
          
    }
    
}
