package com.WeeklyTest.RestaurantManagement.Controller;

//import com.WeeklyTest.RestaurantManagement.Restaurant;
//import com.WeeklyTest.RestaurantManagement.RestaurantService;
import com.WeeklyTest.RestaurantManagement.Entity.Restaurant;
import com.WeeklyTest.RestaurantManagement.Service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated

public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

        @GetMapping("restaurants")
        public List<Restaurant> getRestaurants(){
            return restaurantService.getAllRestaurants();
        }
        @GetMapping("restaurant/{id}")
        public Restaurant getRestaurant(@PathVariable Integer id){
            return restaurantService.getRestaurant(id);
        }

        @PostMapping("restaurant")

        public String addRestaurant(@Valid @RequestBody Restaurant r)
        {
            return restaurantService.addRestaurant(r);
        }

        @PostMapping("restaurants")
        public String addRestaurants(@Valid @RequestBody List<Restaurant> r)
        {
            return restaurantService.addRestaurants(r);
        }

        @PutMapping("restaurant/id/{id}/speciality")
        public String updateSpecialty(@PathVariable Integer id, @RequestParam String special){

            return  restaurantService.updateSpecialilty(id,special);

        }

        @DeleteMapping("restaurant/id/{id}")
        public String deleteRestaurant(@PathVariable Integer id)
        {
            return  restaurantService.deleteRestaurant(id);
        }
}


/*-get Restaurant by id using GetMapping.
-get all Restaurant using  GetMapping
-Add some Restaurant to Restaurant lists using PostMapping
-update Restaurant information like Specialty.
-delete Restaurant from the list*/