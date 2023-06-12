package com.prashant.page.models;

import java.util.List;

public class BreedsWrapper {

    private List<Breeds> breedsWrapper;

    public BreedsWrapper(List<Breeds> breedsWrapper) {
        this.breedsWrapper = breedsWrapper;
    }

    public BreedsWrapper() {
    }

    public List<Breeds> getBreedsWrapper() {
        return breedsWrapper;
    }

    public void setBreedsWrapper(List<Breeds> breedsWrapper) {
        this.breedsWrapper = breedsWrapper;
    }
}
