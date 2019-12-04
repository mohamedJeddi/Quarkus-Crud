package org.acme.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.Objects;

@Entity
public class Event {

    @Id
    private Long id;
    private Date creationDate;
    @ManyToOne
    private MemberPortal createdBy;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public MemberPortal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(MemberPortal createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(creationDate, event.creationDate) &&
                Objects.equals(createdBy, event.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, createdBy);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                '}';
    }
}
