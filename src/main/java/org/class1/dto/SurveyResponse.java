package org.class1.dto;

import java.time.LocalDateTime;

public class SurveyResponse {
    private String message;
    private LocalDateTime timeTaken;

    @Override
    public String toString() {
        return "ServiceResponse{" +
                "message='" + message + '\'' +
                ", timeTaken=" + timeTaken +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(LocalDateTime timeTaken) {
        this.timeTaken = timeTaken;
    }
}
