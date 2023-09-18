package com.WeeklyTest.RestaurantManagement.BeanManger;

import com.WeeklyTest.RestaurantManagement.Entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<Restaurant> restaurantList()
    {
        return  new ArrayList<>();
    }
}
