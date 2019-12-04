package org.acme.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Notification {

    @Id
    private String id;
    private boolean isFlashNews;
    @OneToOne
    private Event event;

    public Notification() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFlashNews() {
        return isFlashNews;
    }

    public void setFlashNews(boolean flashNews) {
        isFlashNews = flashNews;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return isFlashNews == that.isFlashNews &&
                Objects.equals(id, that.id) &&
                Objects.equals(event, that.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isFlashNews, event);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", isFlashNews=" + isFlashNews +
                ", event=" + event +
                '}';
    }
}
