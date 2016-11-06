package gr.amaliatsa.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Amalia on 11/2/2016.
 */

@Document(collection = "questionnaires")
public class Questionnaire {

    @Id
    private String id;

    private String name;

    private String type;

    private String choices;

    private String brLogic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    public String getBrLogic() {
        return brLogic;
    }

    public void setBrLogic(String brLogic) {
        this.brLogic = brLogic;
    }
}
