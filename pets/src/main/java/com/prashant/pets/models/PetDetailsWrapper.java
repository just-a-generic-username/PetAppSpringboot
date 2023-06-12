package com.prashant.pets.models;

import java.util.List;

public class PetDetailsWrapper {

    private List<PetDetails> petDetailsList;

    public PetDetailsWrapper(List<PetDetails> petDetailsList) {
        this.petDetailsList = petDetailsList;
    }

    public PetDetailsWrapper() {
    }

    public List<PetDetails> getPetDetailsList() {
        return petDetailsList;
    }

    public void setPetDetailsList(List<PetDetails> petDetailsList) {
        this.petDetailsList = petDetailsList;
    }
}
