import org.junit.*;//import JUnit testing library
import static org.junit.Assert.*;//import JUnit's assertion library

public class HangmanTest {
//annotation=> informs compiler that JUnit will be responsible for running this code
@Test
//all JUnit tests must be public void
//doesCharMatch name methode this spec tests
//isGuessCharEqualToAvailChar description behaviour spec tests
//true output expecting for input we provide
public void doesCharMatch_isGuessCharEqualToAvailChar_true() {

  Hangman hangman = new Hangman();

  assertEquals(true, hangman.doesCharMatch("e"));
}
}
