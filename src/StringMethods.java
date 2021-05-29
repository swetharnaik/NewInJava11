public class StringMethods {

    public static void main(String[] args) {
        String s = "\tJAVA11 is the latest LTS version\t";
        System.out.println(s+"!!!");
        System.out.println(s.strip()+"!!!");
        System.out.println(s.trim()+"!!!");

        String blankOrEmpty = "";
        System.out.println("isEmpty: " + blankOrEmpty.isEmpty() + " isBlank: " + blankOrEmpty.isBlank());
        blankOrEmpty = "\t   ";
        System.out.println("isEmpty: " + blankOrEmpty.isEmpty() + " isBlank: " + blankOrEmpty.isBlank());

        String pleaseRepeat = "*";
        System.out.println("Repeated 5 times: " + pleaseRepeat.repeat(5));
    }
}
