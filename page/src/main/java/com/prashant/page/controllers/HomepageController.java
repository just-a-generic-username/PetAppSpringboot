package com.prashant.page.controllers;

import com.prashant.page.models.Breeds;
import com.prashant.page.models.BreedsWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Controller
@RequestMapping("/petapp")
public class HomepageController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/homepage")
    public String getBreedsList(Model model) {

        BreedsWrapper breedsWrapper = new BreedsWrapper();

        breedsWrapper = webClientBuilder.build()
                .get()
                .uri("http://breedlist:7001/breeds/getall")
                .retrieve()
                .bodyToMono(BreedsWrapper.class)
                .block();
        List<Breeds> breedsList = breedsWrapper.getBreedsWrapper();
        model.addAttribute("breeds",breedsList);
        return "homepage";

    }

    @GetMapping("/homepage2")
    public String getBreedsList2(Model model) {

        BreedsWrapper breedsWrapper = new BreedsWrapper();

        breedsWrapper = webClientBuilder.build()
                .get()
                .uri("http://breedlist:7001/breeds/getall")
                .retrieve()
                .bodyToMono(BreedsWrapper.class)
                .block();
        List<Breeds> breedsList = breedsWrapper.getBreedsWrapper();
        model.addAttribute("breeds",breedsList);
        return "homepage2";

    }

}
