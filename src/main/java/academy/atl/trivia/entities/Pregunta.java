package academy.atl.trivia.entities;

public class Pregunta {
    private String category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public Integer getAnswer() {
        return answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
