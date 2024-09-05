import java.util.Scanner;


public class StringCompare {

    /**
     * @param args
     */
    public static void main(String args[]) {
        long startTime=System.currentTimeMillis();
        Scanner scn = new Scanner(System.in);
        double x=Math.random(); // pic a random number b/w 0.0 to 1.0 
        StringBuffer str= new StringBuffer();
        str.append("sourav");
        System.out.println(str);
        System.out.println(x*10000);
        System.out.println("Please enter Username:");
        String user = scn.nextLine();
        System.out.println("Please enter password:");
        String pass = scn.nextLine();
        System.out.println("Account Created Successfully");
        System.out.println("Login-");
        System.out.println("Username=");
        String u = scn.nextLine();
        String p = scn.nextLine();
        boolean b = user.equals(u);
        boolean o = pass.equals(p);
        if (b == true & o == true) { // bitwise and operator
            System.out.println("LOgin Succesfull");
        } else {
            System.out.println("Incorret Credintials");
        }
        scn.close();
        System.out.println(System.currentTimeMillis()-startTime+"ms");
    
    }
}
