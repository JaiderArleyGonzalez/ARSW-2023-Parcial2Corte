/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.myrestaurant.restcontrollers;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/orders")
public class OrdersAPIController {
    @Autowired
    RestaurantOrderServicesStub restaurantOrderServicesStub;

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getAllOrdersWithTotals() {
        List<Map<String, Object>> orders = restaurantOrderServicesStub.getAllOrdersWithTotals();
        return ResponseEntity.ok(orders);
    }
    
}
