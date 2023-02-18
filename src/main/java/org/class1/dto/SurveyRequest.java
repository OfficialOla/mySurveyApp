package org.class1.dto;

import java.util.List;

public class SurveyRequest {
    private String title;
    private List<String> questions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestions() {
        return questions.toString();
    }
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
    public String getResponses() {
        return responses.toString();
    }

    public void setResponses(List<List<String>> responses) {
        this.responses = responses;
    }
    private List<List<String>> responses;
//    private LocalDateTime timeCreated;
}
