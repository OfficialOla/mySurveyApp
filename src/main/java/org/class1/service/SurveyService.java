package org.class1.service;

import org.class1.dto.SurveyRequest;
import org.class1.dto.SurveyResponse;
import org.class1.model.Survey;

import java.util.List;
public interface SurveyService {
    SurveyResponse createSurvey(SurveyRequest request);
    Survey findById(int id);
    List<Survey> findAllSurvey();
    void deleteSurvey(Survey survey);
}
