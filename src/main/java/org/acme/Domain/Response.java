package org.acme.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Response {

    @Id
    private String id;
    private String text;
    private String textValue;
    @ManyToOne
    private MiniSurvey miniSurvey;
    @ManyToOne
    private MemberPortal createdBy;
    private boolean booleanValue;

    public Response() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public MemberPortal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(MemberPortal createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public MiniSurvey getMiniSurvey() {
        return miniSurvey;
    }

    public void setMiniSurvey(MiniSurvey miniSurvey) {
        this.miniSurvey = miniSurvey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return booleanValue == response.booleanValue &&
                Objects.equals(id, response.id) &&
                Objects.equals(text, response.text) &&
                Objects.equals(textValue, response.textValue) &&
                Objects.equals(miniSurvey, response.miniSurvey) &&
                Objects.equals(createdBy, response.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, textValue, miniSurvey, createdBy, booleanValue);
    }

    @Override
    public String toString() {
        return "Response{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", textValue='" + textValue + '\'' +
                ", miniSurvey=" + miniSurvey +
                ", createdBy=" + createdBy +
                ", booleanValue=" + booleanValue +
                '}';
    }
}
