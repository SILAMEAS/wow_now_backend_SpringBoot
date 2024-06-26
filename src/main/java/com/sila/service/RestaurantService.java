package com.sila.service;

import com.sila.dto.entityResponseHandler.EntityResponseHandler;
import com.sila.dto.request.RestaurantReq;
import com.sila.dto.request.SearchReq;
import com.sila.dto.response.RestaurantRes;
import com.sila.model.Restaurant;
import com.sila.model.User;
import com.sila.utlis.enums.EnumSort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestaurantService {
    public Restaurant createRestaurant(RestaurantReq req,String jwt) throws Exception;
    public Restaurant updateRestaurant(RestaurantReq updateRestaurant) throws Exception;
    public void deleteRestaurant(Long id)throws Exception;
    public Restaurant findRestaurantById(Long id) throws Exception;
    public Restaurant getRestaurantByUserId(Long userId) throws Exception;
    public User addRestaurantToFavorites(Long restaurantId, User user)throws Exception;
    public Restaurant updateRestaurantStatus(Long restaurantId)throws Exception;
    public EntityResponseHandler<RestaurantRes>  searchRestaurant(Pageable pageable, SearchReq searchReq);
}
