package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min=2, max=50, message="Must contain between 2-50 characters")
    private String location;
    public Employer(){
    }

    public Employer(String location){
        super();
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
