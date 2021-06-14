import java.util.Random;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb=new StringBuilder();
        Random rand=new Random();
        int length=10;

        for (int i=0;i<length;i++){
            int index=rand.nextInt(alphabet.length());
            char randChar=alphabet.charAt(index);
            sb.append(randChar);
        }
        String randString=sb.toString();
        //System.out.println("random password is "+sb);

        String fName,lName,department;
        System.out.print("Enter your firts name-> ");
        fName=scan.nextLine();
        System.out.print("Enter your last name-> ");
        lName=scan.nextLine();
        System.out.print("Enter your department-> ");
        department=scan.nextLine();
        System.out.print("Email adress-> "+fName+lName+department+"@mail.com\n");
        System.out.print("Password-> "+randString);
        int option;

        boolean frag=true;
        while(frag){
            System.out.print("\nnew password-> ");
            String newPass=scan.nextLine();
            System.out.print("Check password-> ");
            String checkPass=scan.nextLine();
            if(newPass.equals(checkPass)){
                randString=newPass;
                frag=false;
            }
            else{
                System.out.print("try again!");
            }
        }
    }
}
