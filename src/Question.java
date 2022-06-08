import java.util.List;

public class Question {

    private List<String> possibleAnswers = List.of("Agree", "Slightly Agree", "Slightly disagree", "Disagree");
    private String selectedAnswer;
    private String topic;

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }
    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
    public String getSelectedAnswer() {
        return selectedAnswer;
    }
    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }



}
