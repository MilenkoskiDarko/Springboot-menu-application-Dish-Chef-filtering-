package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.ChefRepository;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataHolder {
//    public static List<Chef> chefs = new ArrayList<>();
//    public static List<Dish> dishes = new ArrayList<>();
    private final ChefRepository chefRepository;
    private final DishRepository dishRepository;


    @PostConstruct
    public void initializeData(){
        Chef chef1 = chefRepository.save(new Chef(
                "Gordon",
                "Ramsay",
                "World-renowned British chef known for his fiery personality."

        ));
        Chef chef2 = chefRepository.save(new Chef(
                "Deko",
                "Filipcev",
                "Doktor making doner with his hearth"
        ));
        Chef chef3 = chefRepository.save(new Chef(
                "Massimo",
                "Bottura",
                "Innovative Italian chef celebrated for modern interpretations of classic Italian dishes."
        ));

        Chef chef4 = chefRepository.save(new Chef(
                "Heston",
                "Blumenthal",
                "Pioneer of molecular gastronomy, known for creative and scientific cooking methods."
        ));

        Chef chef5 = chefRepository.save(new Chef(
                "Dominique",
                "Crenn",
                "French chef and artist whose poetic approach to cuisine earned her three Michelin stars."
        ));


        dishRepository.save(new Dish("Beef", "Tender beef wrapped in pastry with mushroom duxelles", "Main Course", 5,chef1));
        dishRepository.save(new Dish("Margherita Pizza", "Classic Italian pizza with tomatoes, mozzarella, and basil", "Main Course", 4,chef2));
        dishRepository.save(new Dish("Chocolate Lava Cake", "Warm chocolate cake with molten center", "Dessert", 5,chef3));
        dishRepository.save(new Dish("Caesar Salad", "Crisp romaine lettuce with Caesar dressing and croutons", "Appetizer", 3,chef4));
        dishRepository.save(new Dish("Tom Yum Soup", "Spicy and sour Thai soup with shrimp", "Soup", 4,chef5));



    }
}

//package mk.ukim.finki.wp.lab.bootstrap;
//
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import mk.ukim.finki.wp.lab.model.Chef;
//import mk.ukim.finki.wp.lab.model.Dish;
//import mk.ukim.finki.wp.lab.repository.ChefRepository;
//import mk.ukim.finki.wp.lab.repository.DishRepository;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class DataHolder {
//
//    private final DishRepository dishRepository;
//    private final ChefRepository chefRepository;
//
//    @PostConstruct
//    public void initializeData() {
//
//        for (int i = 0; i < 5; i++) {
//            Chef chef = new Chef(
//                    "FirstName" + i,
//                    "LastName" + i,
//                    "Bio" + i);
//            chefRepository.save(chef);
//
//            Dish dish = new Dish(Integer.toString(i),
//                    "DishName" + i,
//                    "Cuisine" + i,
//                    i,
//                    chef);
//            dishRepository.save(dish);
//        }
//    }
//}