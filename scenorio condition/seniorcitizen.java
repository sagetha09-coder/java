import java.util.Scanner;
class seniorcitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 60) System.out.println(" eligible for senior citizen");
        else System.out.println("Not Eligible for senior citizen");
    }
}
