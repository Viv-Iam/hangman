 public class Hangman {
   private String mAnswer;
   private char[] mGuessedLetters;

public Hangman(String answer, char[] guessedLetters) {
mAnswer = answer;
mGuessedLetters = guessedLetters;
}
public String getAnswer() {
  return mAnswer;
}
public char[] getGuessedLetters() {
  return mGuessedLetters;
}
public boolean isAnswer(String input) {

  if (input.equals(mAnswer)){
  return true;
} else {
   return false;
}
}
 }
