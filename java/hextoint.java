import java.util.Scanner;
    public class hextoint{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
                String hex =sc.nextLine();
                int a=Integer.parseInt(hex,16);
            System.out.print(a);
            
        }
    }