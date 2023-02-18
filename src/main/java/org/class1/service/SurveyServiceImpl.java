package org.class1.service;

import org.class1.data.SurveyRepository;
import org.class1.dto.SurveyRequest;
import org.class1.dto.SurveyResponse;
import org.class1.model.Survey;

import java.util.List;

public class SurveyServiceImpl implements  SurveyService {
    private SurveyRepository surveyRepository;
    @Override
    public SurveyResponse createSurvey(SurveyRequest request) {
//        Survey survey = new Survey();
        // get the request from the user and assign it to survey;
        // survey.setTimeCreated(LocalDateTime.now());
        // survey.setQuestion(List.of(request.getQuestions()));
//        surveyRepository.save();
        return null;
    }

    @Override
    public Survey findById(int id) {
        return null;
    }

    @Override
    public List<Survey> findAllSurvey() {
        return null;
    }

    @Override
    public void deleteSurvey(Survey survey) {

    }
}
