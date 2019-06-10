import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
 
 
public class UsingHamcrest {
 
    public static void main(String[] args) {
 
        String str="Xuan";
 
        // Examples in matching context.
        //-------------------------------
 
        // Positive match.
        str="Xuan";
        if( equalTo("Xuan").matches(str) )
            System.out.println("The string is equal to Xuan.");
        else
            System.out.println("The string is NOT equal to Xuan.");
 
        // Negative match.
        str = "Some very long string.";
        if( containsString("Xuan").matches(str) )
            System.out.println("String does contain 'Xuan'.");
        else
            System.out.println("String does NOT contain 'Xuan'.");
 
 
        // Examples in unit test context.
        //-------------------------------
 
        // Exception thrown.
        str = "Assert string containing something.";
        assertThat(str, is(equalTo("Not found")));
    }
 
}