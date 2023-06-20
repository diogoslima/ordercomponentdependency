package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double shipment = 0;
        if (order.getBasic() < 100.00){
            shipment = 20.00;
        }
        if (order.getBasic() >= 100.00 && order.getBasic() < 200.00){
            shipment = 12.00;
        }
        return shipment;
    }
}
