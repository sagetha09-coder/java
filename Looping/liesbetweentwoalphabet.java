import java.util.Scanner;
    public class liesbetweentwoalphabet{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=a+1;i<b;i++){
                System.out.print((char)i+" ");
            }
        


        }
    }