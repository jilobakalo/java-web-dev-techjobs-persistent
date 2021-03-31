package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 10, max = 500, message = "Skill must be between 10 and 500 characters.")
    @NotBlank
    private String description;


     @ManyToMany(mappedBy = "skills")
     private List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     public List<Job> getJobs() {
     return jobs;
     }

}