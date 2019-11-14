import java.util.regex.Pattern;

public class newTest {

    public static void main(String[] args) {
        String name = "kao";
        String regex = "[가-힣]*";
        boolean result = Pattern.matches(name, regex);
        System.out.println(result);
    }
}
