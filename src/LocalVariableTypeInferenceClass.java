import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LocalVariableTypeInferenceClass {

    //var cannot be used in class or instance variables
    //static var classVar = 10;
    //var instanceVar = 20;

    public static void main(String[] args) {
        //var can be used if compiler can figure out the value.
        // Here it infers to an object of type int.
        var aNumber = 5;

        //var is not a datatype and not a keyword
        var var = "Hello";

        //Infers to an object of type SomeClassWhichDoesSomething
        var someClass = new SomeClassWhichDoesSomething();

        //compound declarations not allowed
        //var a, b = 3;

        //LVTI for lambda expression
        var arr = new String[]{"Hello", "Hi", "Hey", "Heya", "Bye", "Hallo"};
        Predicate<String> longPredicate = (var x) -> x.equals("Bye");
        Arrays.stream(arr).anyMatch(longPredicate);
    }
}

class SomeClassWhichDoesSomething {
    int firstVar;
    int secondVar;
}
