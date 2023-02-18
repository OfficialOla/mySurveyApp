package org.class1.utility;

import org.class1.dto.SurveyResponse;
import org.class1.model.Survey;

public interface Mapper {
    public Survey mapSurveyRequestToSurvey();
    public SurveyResponse mapSurveyResponse();
}
