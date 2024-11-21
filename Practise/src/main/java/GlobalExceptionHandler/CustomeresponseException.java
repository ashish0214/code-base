package GlobalExceptionHandler;

import java.util.Date;
import java.util.Objects;

public class CustomeresponseException {
    private Date timeStamp;
    private String message;

    public CustomeresponseException(Date timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomeresponseException that)) return false;
        return Objects.equals(timeStamp, that.timeStamp) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp, message);
    }

    @Override
    public String toString() {
        return "CustomeresponseException{" +
                "timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                '}';
    }
}
