package org.class1.model;


import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Survey {
    private String title;
    private List<String> questions;

    public Survey(String title, String questions, int id, String responses, LocalDateTime dateCreated, LocalDateTime dateTaken) {
        this.title = title;
        this.questions = Collections.singletonList(questions);
        this.id = id;
        this.responses = Collections.singletonList(responses);
        this.dateCreated = dateCreated;
        this.dateTaken = dateTaken;
    }

    private int id;
    private List<String> responses;
    private LocalDateTime dateCreated;

    @Override
    public String toString() {
        return "Survey{" +
                "title='" + title + '\'' +
                ", questions='" + questions + '\'' +
                ", id=" + id +
                ", responses='" + responses + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateTaken=" + dateTaken +
                '}';
    }
    private LocalDateTime dateTaken;
}
