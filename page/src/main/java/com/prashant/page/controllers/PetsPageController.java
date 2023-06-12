package com.prashant.page.controllers;

import com.prashant.page.models.Breeds;
import com.prashant.page.models.BreedsWrapper;
import com.prashant.page.models.PetDetails;
import com.prashant.page.models.PetDetailsWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Controller
@RequestMapping("/petapp/petpage")
public class PetsPageController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/confirmation")
    public String buildForm() {
        return "confirmform";
    }

    @GetMapping("/getpets")
    public String getBreedsList(@RequestParam("name") String name, Model model) {

        PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();

        petDetailsWrapper = webClientBuilder.build()
                .get()
                .uri("http://pets:7002/pets/"+name)
                .retrieve()
                .bodyToMono(PetDetailsWrapper.class)
                .block();
        List<PetDetails> petDetailsList = petDetailsWrapper.getPetDetailsList();
        model.addAttribute("petslist",petDetailsList);
        return "petspage";

    }

    @PostMapping("/getpetsform")
    public String getBreedsListByForm(@RequestParam("name") String name, Model model) {

        PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();

        petDetailsWrapper = webClientBuilder.build()
                .get()
                .uri("http://pets:7002/pets/"+name)
                .retrieve()
                .bodyToMono(PetDetailsWrapper.class)
                .block();
        List<PetDetails> petDetailsList = petDetailsWrapper.getPetDetailsList();
        model.addAttribute("petslist",petDetailsList);
        return "petspage";

    }

}
