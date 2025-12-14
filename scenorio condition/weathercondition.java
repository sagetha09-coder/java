import java.util.Scanner;
    public class  weathercondition{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int temp=sc.nextInt();
            if(temp<15){
                System.out.println("Cold");
            }else if(temp>=15 && temp<25){
                System.out.println("Pleasent");
            }else if(temp>=25 && temp<35){
                System.out.println("Hot");
            }else{
                System.out.println("Heatwave");
            
            }
        }
    }