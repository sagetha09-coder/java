import java.util.Scanner;
    public class CQ1{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
                System.out.println("Vowels");
            }else{
                System.out.println("Consonant");
            }
        }

    }