public interface Survey {

    int getQuestionsCount();

    Feedback submitResponse(String response);

    double calculateSatisfactionLevel();
}