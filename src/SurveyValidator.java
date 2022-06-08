import java.util.List;

public class SurveyValidator {

    private int countAgree;
    private int countDisagree;
    private int countSlightlyAgree;
    private int countSlightlyDisagree;
    private int sum = 0;

    public void validateSurveyQuestions(List<Question> questions) {
        boolean validSurvey = true;
        for (int i = 0; i < questions.size(); i++) {
            for (int j = i + 1; j < questions.size(); j++) {
                if (questions.get(i).equals(questions.get(j))) {
                    validSurvey = false;
                }
            }

        }
        if (validSurvey) {
            System.out.println("Survey is valid");
        } else {
            System.out.println("Survey is not valid");
        }
    }

    public void validateSurveySize(List<String> survey) {
        // check if survey has <10&>40 questions
        if (survey.size() < 10 || survey.size() > 40) {
            System.out.println("Your survey is not valid");
        } else {
            System.out.println("Your survey is valid");
        }
    }

    // find the most given answer in a survey
    public void addAnswer(String answer) {
        switch (answer) {
            case "1":
                countAgree++;
                break;
            case "2":
                countDisagree++;
                break;
            case "3":
                countSlightlyAgree++;
                break;
            case "4":
                countSlightlyDisagree++;
                break;
            default:
                System.out.print("Not valid!");
                break;
        }

    }

    public void countMostGivenAnswer() {
        int largest = 0;
        int[] countsArray = new int[4];
        countsArray[0] = countAgree;
        countsArray[1] = countDisagree;
        countsArray[2] = countSlightlyAgree;
        countsArray[3] = countSlightlyDisagree;

        for (int count : countsArray) {
            if (count > largest) {
                largest = count;
            }
        }

        for(int index=0;index<countsArray.length;index++) {
            sum=sum+countsArray[index];
        }

        if (largest == countAgree)
            System.out.println("The most given answer is Agree by " + largest + "/" + sum);
        else if (largest == countDisagree)
            System.out.println("The most given answer is Disagree by " + largest + "/" + sum);
        else if (largest == countSlightlyAgree)
            System.out.println("The most given answer is Slightly Agree by " + largest + "/" + sum);
        else if (largest == countSlightlyDisagree)
            System.out.println("The most given answer is Slightly Disagree by " + largest + "/" + sum);
    }


}
