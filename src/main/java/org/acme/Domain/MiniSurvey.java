package org.acme.Domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class MiniSurvey extends StreamLinePost {

    private String question;
    @OneToMany(mappedBy = "miniSurvey")
    private List<Response> response;

    public MiniSurvey() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MiniSurvey that = (MiniSurvey) o;
        return Objects.equals(question, that.question) &&
                Objects.equals(response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), question, response);
    }

    @Override
    public String toString() {
        return "MiniSurvey{" +
                "question='" + question + '\'' +
                ", response=" + response +
                '}';
    }
}
