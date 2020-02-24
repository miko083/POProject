package football;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Event {
    void setFavorite();
    String getEventName();
    String getDate();
    LocalDate getLocalDate();
    String getType();
    String getNotes();
    String getResults();
    LocalDateTime getLocalDateTime();
}
