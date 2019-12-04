package org.acme.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class StreamLinePost extends Publication {


    private String title;
    private String picture;

    public StreamLinePost() {
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StreamLinePost that = (StreamLinePost) o;
        return  Objects.equals(title, that.title) &&
                Objects.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, picture);
    }

    @Override
    public String toString() {
        return "StreamLine{" +
                ", title='" + title + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
