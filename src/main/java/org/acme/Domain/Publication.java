package org.acme.Domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Publication {

    @Id
    private String id;
    private String context;
    private boolean isShowed;
    private String status;
    @OneToOne
    private Event event;

    public Publication() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isShowed() {
        return isShowed;
    }

    public void setShowed(boolean showed) {
        isShowed = showed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Publication that = (Publication) o;
        return isShowed == that.isShowed &&
                Objects.equals(id, that.id) &&
                Objects.equals(context, that.context) &&
                Objects.equals(status, that.status) &&
                Objects.equals(event, that.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, isShowed, status, event);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id='" + id + '\'' +
                ", context='" + context + '\'' +
                ", isShowed=" + isShowed +
                ", status='" + status + '\'' +
                ", event=" + event +
                '}';
    }
}
