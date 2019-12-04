package org.acme.Domain;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Objects;

@Entity
public class News extends Publication {

    private boolean newFlag;
    private Date flagDuration;
    private String title;
    private String description;
    private String category;

    public News() {
    }


    public boolean isNewFlag() {
        return newFlag;
    }

    public void setNewFlag(boolean newFlag) {
        this.newFlag = newFlag;
    }

    public Date getFlagDuration() {
        return flagDuration;
    }

    public void setFlagDuration(Date flagDuration) {
        this.flagDuration = flagDuration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        News news = (News) o;
        return newFlag == news.newFlag &&
                Objects.equals(flagDuration, news.flagDuration) &&
                Objects.equals(title, news.title) &&
                Objects.equals(description, news.description) &&
                Objects.equals(category, news.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), newFlag, flagDuration, title, description, category);
    }

    @Override
    public String toString() {
        return "News{" +
                ", newFlag=" + newFlag +
                ", flagDuration=" + flagDuration +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
