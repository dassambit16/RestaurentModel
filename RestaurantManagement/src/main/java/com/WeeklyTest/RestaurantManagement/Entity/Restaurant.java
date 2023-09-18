package com.WeeklyTest.RestaurantManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restaurant {


    private Integer restaurantId;
    private String  restaurantName;
    private String  restaurantAddress;
    private Integer restaurantContact;
    private String restaurantEmail;
    private String  restaurantSpeciality;
    private Integer numberOfStaff;
    private Type    restaurantType;




}
