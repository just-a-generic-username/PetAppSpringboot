package com.prashant.pets.controllers;

import com.prashant.pets.models.PetDetails;
import com.prashant.pets.models.PetDetailsWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pets")
@ResponseBody
public class PetController {

    @GetMapping("/{name}")
    public PetDetailsWrapper getPetDetails(@PathVariable("name") String name) {

        if(name.equals("Exotic Short Hair")) {
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Sawyer", "Adult", "Male", "Medium", "Washington, DC", "(202) 723-5730", "humane_rescue_alliance@gmail.com",
                            "Humane Rescue Alliance", "Hello, I'm Sawyer! If you're ready to adopt within the next 24-48 hours and want to meet me, you can start the process."),
                    new PetDetails("Rose", "Adult", "Male", "Medium", "Wilmington, NC", "(910) 792-9014", "catnc@earthlink.net",
                            "Cat Adoption Team", "Rose is a 10-week old sweet and playful kitten. She loves to play with her siblings, including Daphne."),
                    new PetDetails("Missy", "Adult", "Female", "Small", "Redmond, WA", "(981) 299-9014", "seattlerescue@hotmail.com",
                            "Seattle Rescue", "Needs to be an only pet. Missy is a 11 y/o Exotic Shorthair. She is very calm and gentle. She loves getting pets from her humans and especially loves it if you help her clean her cute little face.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Persian")) {
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Cutie", "Adult", "Female", "Medium", "Mississauga, ON", "(647) 968-3070", "intlpawstoronto@hotmail.com",
                            "International Paws Toronto", "Welcome to Canada Cutie! This gorgeous 2 year old pure-bred Persian was rescued from the streets of Saudi Arabia after she was no longer wanted by her previous family. She was rescued by a very kind lady who took care of her until Cutie could fly to Toronto in search of her forever home."),
                    new PetDetails("Tito", "Senior", "Male", "Medium", "Mississauga, ON", "(647) 968-3070", "international@gmail.com", "International Paws Toronto",
                            "Tito is a very handsome rare Ragdoll X Persian cats who was rescued from terrible conditions in Saudi Arabia. He is such a sweetheart who loves to be pet and scratches under his chin. Tito does well with other cats, children and cat-friendly dogs if given space and time to adjust to his new surroundings."),
                    new PetDetails("Penny", "Adult", "Male", "Medium", "Old Bridge, NJ", "(914) 393-8292", "elaine@happyhomesinc.org",
                            "Happy Homes Animals", "Penny is a stunning white Doll Face Persian who recently joined us from Kuwait. He is a gorgeous cat with the most unique eyes.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Calico")) {
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Helena", "Adult", "Female", "Small", "Charlotte, NC", "(704) 879-1729", "info@c2cnd.org", "Catering To Cats & Dogs",
            "Estimated Birthday: 5/15/2020. If interested in adopting please visit our website at www.c2cnd.org to complete an adoption application. Adoption applications are accepted and reviewed from the Charlotte and the surrounding areas only."),
                    new PetDetails("Opal", "Adult", "Female", "Medium", "Mount Dora, FL", "(352) 609-2362", "hoffmeyerar@gmail.com",
                            "Hoffmeyer Animal Rescue", "6 year old Opal found herself in a high kill shelter in a neighboring state. Her mom went into a nursing facility and she had no family to take poor Opal. She was extremely depressed and closed off when she came and now she’s posing for photos in the hopes to find her new forever family. She is front declawed and we often hear her talking."),
                    new PetDetails("Peaches", "Adult", "Female", "Small", "Los Angeles, CA", "(310) 473-5585", "info@langefoundation.org",
                            "Lange Foundation", "Peaches came to us from the Palmdale shelter pregnant and ready to pop. She gave birth to 6 kittens and was a very good mom. Now that her kittens are weaned she is ready to find her forever home."),
                    new PetDetails("Julie", "Kitten", "Female", "Medium", "Garland, TX", "(380) 373-4087", "Adoptions@nbcrtx.org",
                            "Beginnings Cat", "Julie was rescued with her mother and 6 other siblings. She is outgoing and loves to stalk her toy bird. She spends all day playing with her siblings and napping")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Turkish Angora")){
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Magneto", "Adult", "Male", "Medium", "Buford, GA", "(770) 831-5513", "adoptions@catrangers.org",
                            "CatRangers at La Maison", "You can fill out an adoption application online on our official website.My name is Magneto and I truly thought I was living a great life, until my family had to move and said they couldn't take me with."),
                    new PetDetails("Lily", "Young", "Female", "Medium", "Marion, CT", "(203) 768-5880", "adoptionservices@caosab.ca",
                            "Nile Valley Foundation", "Lilly is just under the age of two and now ready for her forever family! She has not been with dogs so we are not sure how she will do with one in the family, and should be fine with other cats given enough time to adjust."),
                    new PetDetails("Vern", "Adult", "Male", "Medium", "Red Deer, AB", "(890) 624-0921", "adoptions@catrangers.org", "Companion Animal", "Love Bug Do you seek affection? I do! If you also like petting, purrs, and paws kneading your lap, I think we might have a LOT in common.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Labrador Retriever")){
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Selena", "Puppy", "Female", "Medium", "Washington, DC", "(202) 723-4720", "applications@barrkli.org", "BARRK Animal Rescue", "Selena is the sweetest jelly bean around 3-4 months old. She was recently rescued with her littermates from Texas, and now she's becoming a real city girl."),
                    new PetDetails("Diego", "Young", "Male", "Medium", "Maple Grove, MN", "(612) 588-0188", "happy@tailsrescue.org",
                            "Happy Tails Rescue", "My name is Diego and I am a super sweet, playful boy!I am great with kids. I love people and like to stay close to them"),
                    new PetDetails("Tawny", "Young", "Female", "Medium", "Manhasset, NY", "(516) 459-3509", "lrhrescue@gmail.com",
                            "Long Road Home", "Tawny is a playful girl who is somewhere between one and two years old."),
                    new PetDetails("Cher", "Adult", "Female", "Medium", "Overland Park, KS", "(816) 366-5434", "adoptionstrp@gmail.com", "Overland Park, KS",
            "Cher is a 2 year old Labrador Retriever/Husky mix who shows some of the best qualities of both! Cher’s attention is always on her human and her favorite thing to do is cuddle.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("German Shepherd")){
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Addy", "Adult", "Female", "Medium", "Tulsa, OK", "(918) 928-9944", "oklahomagsr@gmail.com", "Oklahoma GS Rescue", "Addy is a playful energetic dog who will need continued obedience training currently knows sit, stay, no & is working on heal."),
                    new PetDetails( "Odin", "Adult", "Male", "Large", "Irvine, CA", "(714) 528-4730", "inquiries@coastalgsr.org", "German Shepherd Rescue", "We've found this big boy, who is 4 years old, to be a happy guy who loves water, chasing down balls, is working on his leash skills, has no bad reaction towards other dogs while on leash, and loves going for walks around town"),
                    new PetDetails("Scooby", "Young", "Male", "Large", "San Jose, CA", "408-309-2667", "mrotties4ever@aol.com", "Group to Protect Animals", "Scooby's ideal companion would be someone who has experience with training unsure larger dogs and lives in a home with adults only.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Poodle")){
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Tucker", "Senior", "Male", "Medium", "Lomita, CA", "(654) 279-5729", "corgially@att.net", "Anthonys Canine Rescue",
            "Tucker is a poodle and wheaton Terrier mix neutered male. He is about 11 years old. He is an owner surrender as the couple have too many dogs and a toddler."),
                    new PetDetails("Winnie", "Senior", "Male", "Small", "Valley Village, CA", "(332) 789-2462", "contact@bigloveanimalrescue.org", "Love Animal Rescue",
            "Winnie is incredibly special to us! We rescued this 9-year-young senior boy from the streets after reports came in of his owner passing away suddenly."),
                    new PetDetails("Harvey", "Senior", "Male", "Small", "El Cajon, CA", "619-212-5623", "seniors@lionelslegacy.org", "Lionel's Legacy",
                            "Harvey is a happy, snuggly little fellow. He is very friendly and sociable with dogs, cats, adults and respectful children."),
                    new PetDetails( "Archie", "Young", "Male", "Small", "Costa Mesa, CA", "(949) 645-4912", "ahome4ever@gmail.com", "Costa Mesa, CA",
                            "Archie is a 3 year old, 12 pound, male terrier poodle mix (terripoo) who is the sweetest little boy ever")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else if(name.equals("Pomeranian")){
            List<PetDetails> petDetailsList = Arrays.asList(
                    new PetDetails("Buddy", "Adult", "Male", "Small", "Brooklyn, NY", "(670) 531-4976", "applications@koreank9rescue.org", "Korean K9 Rescue", "Meet Buddy! Buddy is a male Pomeranian/Pekingese mix that is 3 years old and weighs about 18 pounds."),
                    new PetDetails("Jiggy", "Adult", "Male", "Small", "Chatham, ON", "(519) 354-5000", "adopt@ckanimalrescue.com", "CK Animal Rescue", "Jiggy gets very excited if he knows he is going for a walk or a ride. Jiggy is great on his leash and loves to be your car companion."),
                    new PetDetails("Brandi", "Adult", "Female", "Small", "Bedford Hills, NY", "(914) 205-7066", "info@anewchancear.org", "New Chance Animal Rescue",
                            "Meet Brandi! At 6 years old and 18 lbs, this adorable Pomeranian is grateful to be living in a loving home.")
            );
            PetDetailsWrapper petDetailsWrapper = new PetDetailsWrapper();
            petDetailsWrapper.setPetDetailsList(petDetailsList);
            return petDetailsWrapper;
        }
        else {
            return new PetDetailsWrapper();
        }
    }
}
