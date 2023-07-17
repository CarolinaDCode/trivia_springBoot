package academy.atl.trivia.entities;

public class Pregunta {
    private Category category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;

    public Pregunta(Category category, String question, String[] options, Integer answer, String explanation) {
        this.category = category;
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.explanation = explanation;
    }

    public Category getCategory() {
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

    public void setCategory(Category category) {
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
