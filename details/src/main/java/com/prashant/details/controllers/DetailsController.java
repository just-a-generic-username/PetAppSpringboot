package com.prashant.details.controllers;

import com.prashant.details.models.BreedDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/getdetails")
public class DetailsController {

    @GetMapping("/{id}")
    public BreedDetails returnBreedDetails(@PathVariable("id") int id) {

        List<BreedDetails> breedDetailsList = Arrays.asList(
                new BreedDetails(1, "Exotic Short Hair", "USA", "Black and white, and chinchilla silver", "10 to 30 years", "15 pounds"),
                new BreedDetails(2, "Persian", "African wildcat", "Ash, Black, Cream, White Persian Cat", "10 to 17 years", "7-12 pounds"),
                new BreedDetails(3, "Calico", "Egypt", "Black, white and orange", "10 to 17 years", "7-9 pounds"),
                new BreedDetails(4, "Turkish Angora", "Turkey", "Black, Blue, Red, Cream", "12 to 18 years", "8-15 pounds"),
                new BreedDetails(5, "Labrador Retriever", "Newfoundland", "Black, Chocolate, Yellow", "10 to 12 years", "60-80 pounds"),
                new BreedDetails(6, "German Shepherd", "Germany", "Black, Black & Tan, Sable, Grey, Red & Black, Black & Silver", "9 to 13 years", "85-90 pounds"),
                new BreedDetails(7, "Poodle", "France, Germany", "Black, White, Apricot, Sable, Cream, Black & White, Grey", "12 to 15 years", "45-70 pounds"),
                new BreedDetails(8, "Pomeranian", "Germany, Poland", "White, Black, Blue, Red, Cream, Grey-shaded, Tan, Orange, Brown", "12 to 16 years", "3-7 pounds")
        );

        for(BreedDetails breedDetails: breedDetailsList) {
            if(breedDetails.getId() == id){
                return breedDetails;
            }
        }
        return new BreedDetails(9, "Mystery Pet", "Earth", "Mystery colour", "Unknown", "Unknown");
    }
}
