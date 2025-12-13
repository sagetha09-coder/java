import java.util.Scanner;
    public class YQ4{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int year1=sc.nextInt();
            int year2=sc.nextInt();
            int LD=year1%10;
            int LD1=year2%10;
            if(LD==LD1){
                System.out.println("Same last digit");
            }else{
                System.out.println("Not same last digit");
            }
        }
    }