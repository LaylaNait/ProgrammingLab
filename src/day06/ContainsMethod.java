package day06;

public class ContainsMethod {
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean c;
        if(sentence.contains(word)){
            c = true;
        }else {
            c= false;
        }
        System.out.println(c);

        scan.close();
    }
}
