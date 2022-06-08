import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        Question questions = new Question();
        List<Survey> surveyList = new ArrayList<Survey>();
        SurveyValidator validator = new SurveyValidator();
        Survey firstSurvey = createSurvey();
        surveyList.add(firstSurvey);

    }

    public static Survey createSurvey() {
        Survey survey = new Survey();
        List<Question> questions = new ArrayList<Question>();
        Scanner input = new Scanner(System.in);
        SurveyValidator validator = new SurveyValidator();
        List<Survey> surveyList = new ArrayList<Survey>();

        Question firstQuestion = new Question();
        Question secondQuestion = new Question();
        Question thirdQuestion = new Question();
        Question fourthQuestion = new Question();
        Question fifthQuestion = new Question();
        Question sixthQuestion = new Question();
        Question seventhQuestion = new Question();
        Question eigthQuestion = new Question();
        Question ninthQuestion = new Question();
        Question tenQuestion = new Question();

        System.out.println("Press 1-Agree, 2-Disagree, 3-Slightly Agree, 4-Slightly Disagree");
        firstQuestion.setTopic("Do you think programming is popular?");
        System.out.println(firstQuestion.getTopic());
        String answer1 = input.next();
        firstQuestion.setSelectedAnswer(answer1 + "\n");
        validator.addAnswer(answer1);
        questions.add(firstQuestion);

        secondQuestion.setTopic("Do you think java has arised in recent years? ");
        System.out.println(secondQuestion.getTopic());
        String answer2 = input.next();
        secondQuestion.setSelectedAnswer(answer2 + "\n");
        validator.addAnswer(answer2);
        questions.add(secondQuestion);

        thirdQuestion.setTopic("Do you think you will become a good developer?");
        System.out.println(thirdQuestion.getTopic());
        String answer3 = input.next();
        thirdQuestion.setSelectedAnswer(answer3 + "\n");
        validator.addAnswer(answer3);
        questions.add(thirdQuestion);

        fourthQuestion.setTopic("Do you think java will be popular in Albania?");
        System.out.println(fourthQuestion.getTopic());
        String answer4 = input.next();
        fourthQuestion.setSelectedAnswer(answer4 + "\n");
        validator.addAnswer(answer4);
        questions.add(fourthQuestion);

        fifthQuestion.setTopic("Do you think programming in Java is difficult?");
        System.out.println(fifthQuestion.getTopic());
        String answer5 = input.next();
        fifthQuestion.setSelectedAnswer(answer5 + "\n");
        validator.addAnswer(answer5);
        questions.add(fifthQuestion);

        sixthQuestion.setTopic("Do you think java has changed things? ");
        System.out.println(sixthQuestion.getTopic());
        String answer6 = input.next();
        sixthQuestion.setSelectedAnswer(answer6 + "\n");
        validator.addAnswer(answer6);
        questions.add(sixthQuestion);

        seventhQuestion.setTopic("Do you think programming is good?");
        System.out.println(seventhQuestion.getTopic());
        String answer7 = input.next();
        seventhQuestion.setSelectedAnswer(answer7 + "\n");
        validator.addAnswer(answer7);
        questions.add(seventhQuestion);

        eigthQuestion.setTopic("Do you think java has is good? ");
        System.out.println(eigthQuestion.getTopic());
        String answer8 = input.next();
        eigthQuestion.setSelectedAnswer(answer8 + "\n");
        validator.addAnswer(answer8);
        questions.add(eigthQuestion);

        ninthQuestion.setTopic("Do you like java? ");
        System.out.println(ninthQuestion.getTopic());
        String answer9 = input.next();
        ninthQuestion.setSelectedAnswer(answer9 + "\n");
        validator.addAnswer(answer9);
        questions.add(ninthQuestion);

        tenQuestion.setTopic("Do you think java is the best option for you? ");
        System.out.println(tenQuestion.getTopic());
        String answer10 = input.next();
        tenQuestion.setSelectedAnswer(answer10 + "\n\n");
        validator.addAnswer(answer10);
        questions.add(tenQuestion);
        questions.remove(firstQuestion);

        validator.countMostGivenAnswer();

        System.out.println();
        System.out.println("Do you want to take another survey? Pres Y for Yes and N for No ");
        String answer = input.next();

        if (answer.equals("y") || answer.equals("Y")) {
            Survey newSurvey = createSurvey();
            surveyList.add(newSurvey);
        } else {
            validator.countMostGivenAnswer();

        }
        survey.setQuestions(questions);
        return survey;

    }

}
