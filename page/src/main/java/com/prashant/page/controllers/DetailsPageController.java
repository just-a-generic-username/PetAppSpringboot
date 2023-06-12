package com.prashant.page.controllers;

import com.prashant.page.models.BreedDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
@RequestMapping("/petapp/detailspage")
public class DetailsPageController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/form")
    public String buildForm() {
        return "form";
    }

    @GetMapping("/deets")
    public String getBreedDetails(@RequestParam("id") int id, Model model) {

        BreedDetails breedDetails = webClientBuilder.build()
                .get()
                .uri("http://details:7003/getdetails/" + id)
                .retrieve()
                .bodyToMono(BreedDetails.class)
                .block();

        model.addAttribute("breeddetails", breedDetails);

        if(id < 5) {
            return "detailspagecat";
        }
        return "detailspagedog";
    }

    @PostMapping("/deetsform")
    public String getBreedDetailsWithForm(@RequestParam("id") int id, Model model) {

        BreedDetails breedDetails = webClientBuilder.build()
                .get()
                .uri("http://details:7003/getdetails/" + id)
                .retrieve()
                .bodyToMono(BreedDetails.class)
                .block();

        model.addAttribute("breeddetails", breedDetails);

        if(id < 5) {
            return "detailspagecat";
        }
        return "detailspagedog";
    }

}
