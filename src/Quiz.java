public class Quiz {

    String question;
    String choices;
    String correct;
    int score;

    public Quiz(String question, String choices, String correct, int score) {
        this.question = question;
        this.choices = choices;
        this.correct = correct;
        this.score = score;
    }
}
