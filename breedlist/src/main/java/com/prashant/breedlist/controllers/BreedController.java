package com.prashant.breedlist.controllers;

import com.prashant.breedlist.models.Breeds;
import com.prashant.breedlist.models.BreedsWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/breeds")
public class BreedController {

    @GetMapping("/getall")
    public BreedsWrapper getAllBreeds() {

        List<Breeds> breedsList = Arrays.asList(
                new Breeds(1, "Exotic Short Hair", "cat", "The Exotic Shorthair is a short-haired version of the Persian."),
                new Breeds(2, "Persian", "cat", "The Persian cat is a long-haired breed of cat."),
                new Breeds(3, "Calico", "cat", "A calico cat is a domestic cat of any breed with a tri-color coat."),
                new Breeds(4, "Turkish Angora", "cat", "The Turkish Angora is a breed of domestic cat."),
                new Breeds(5, "Labrador Retriever", "dog", "The Labrador Retriever, is a medium-large gun dog"),
                new Breeds(6, "German Shepherd", "dog", "A breed of medium to large-sized working dog"),
                new Breeds(7, "Poodle", "dog", "A breed of water dog divided into four varieties based on size"),
                new Breeds(8, "Pomeranian", "dog", "A breed of dog of the Spitz type that is named for the Pomerania region")
        );
        BreedsWrapper breedsWrapper = new BreedsWrapper();
        breedsWrapper.setBreedsWrapper(breedsList);
        return breedsWrapper;
    }

}
