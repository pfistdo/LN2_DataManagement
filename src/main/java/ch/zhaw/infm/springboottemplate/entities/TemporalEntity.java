package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class TemporalEntity {
    String lastChangeUser;
    LocalDateTime lastChangeTimestamp;

    public TemporalEntity() {
    }

    public TemporalEntity(String lastChangeUser, LocalDateTime lastChangeTimestamp) {
        this.lastChangeUser = lastChangeUser;
        this.lastChangeTimestamp = lastChangeTimestamp;
    }

    public String getLastChangeUser() {
        return lastChangeUser;
    }

    public void setLastChangeUser(String lastChangeUser) {
        this.lastChangeUser = lastChangeUser;
    }

    public LocalDateTime getLastChangeTimestamp() {
        return lastChangeTimestamp;
    }

    public void setLastChangeTimestamp(LocalDateTime lastChangeTimestamp) {
        this.lastChangeTimestamp = lastChangeTimestamp;
    }
}
