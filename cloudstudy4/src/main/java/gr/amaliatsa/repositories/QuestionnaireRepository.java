package gr.amaliatsa.repositories;

import gr.amaliatsa.models.Questionnaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Amalia on 11/2/2016.
 */
@Repository
public interface QuestionnaireRepository extends MongoRepository<Questionnaire,String> {

}
