public class VowelsConsonants {
    public static void main(String[] args) {

        System.out.print("Vowels: ");
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                System.out.print(c + " ");
        }

        System.out.print("\nConsonants: ");
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            if (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
                System.out.print(c + " ");
        }
    }
}
