package com.abenezermulugeta;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements  Staff {
    private String qualification;

    public Doctor() {
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void assist() {
        System.out.println("Doctor is assisting as " + getQualification());
    }
}
