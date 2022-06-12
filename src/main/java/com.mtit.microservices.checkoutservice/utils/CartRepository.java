//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.utils;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CartRepository extends CrudRepository<Cart, Integer> {

    @Modifying
    @Transactional
    @Query("delete from Cart c where c.foodId =:foodId and c.customerId=:customerId")
    Integer deleteFromCart(@Param("foodId") String foodId, @Param("customerId") String customerId);


    @Modifying
    @Transactional
    @Query("update Cart c set c.quantity =:quantity where c.foodId =:foodId and c.customerId=:customerId")
    Integer updateCartQuantity(@Param("quantity") String quantity, @Param("foodId") String foodId, @Param("customerId") String customerId);
}
